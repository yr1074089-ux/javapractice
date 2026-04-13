// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {
   public KosarajuAlgo() {
   }

   public static void topoSort(ArrayList<Edge>[] var0, int var1, boolean[] var2, Stack<Integer> var3) {
      var2[var1] = true;

      for(Edge var5 : var0[var1]) {
         if (!var2[var5.dest]) {
            topoSort(var0, var5.dest, var2, var3);
         }
      }

      var3.push(var1);
   }

   public static void dfs(ArrayList<Edge>[] var0, int var1, boolean[] var2) {
      var2[var1] = true;
      System.out.print(var1 + " ");

      for(Edge var4 : var0[var1]) {
         if (!var2[var4.dest]) {
            dfs(var0, var4.dest, var2);
         }
      }

   }

   public static void kosaraju(ArrayList<Edge>[] var0, int var1) {
      Stack var2 = new Stack();
      boolean[] var3 = new boolean[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         if (!var3[var4]) {
            topoSort(var0, var4, var3, var2);
         }
      }

      ArrayList[] var8 = new ArrayList[var1];

      for(int var5 = 0; var5 < var1; ++var5) {
         var3[var5] = false;
         var8[var5] = new ArrayList();
      }

      for(int var9 = 0; var9 < var1; ++var9) {
         for(Edge var7 : var0[var9]) {
            var8[var7.dest].add(new Edge(var7.dest, var7.src));
         }
      }

      while(!var2.isEmpty()) {
         int var10 = (Integer)var2.pop();
         if (!var3[var10]) {
            System.out.print("SCC: ");
            dfs(var8, var10, var3);
            System.out.println();
         }
      }

   }

   public static void createGraph(ArrayList<Edge>[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = new ArrayList();
      }

      var0[0].add(new Edge(0, 2));
      var0[0].add(new Edge(0, 3));
      var0[1].add(new Edge(1, 0));
      var0[2].add(new Edge(2, 1));
      var0[3].add(new Edge(3, 4));
   }

   public static void main(String[] var0) {
      byte var1 = 5;
      ArrayList[] var2 = new ArrayList[var1];
      createGraph(var2);
      kosaraju(var2, var1);
   }

   static class Edge {
      int src;
      int dest;

      Edge(int var1, int var2) {
         this.src = var1;
         this.dest = var2;
      }
   }
}
