import java.util.*;
public class NearbycarseByheaps{
    static class point implements Comparable<point>{
        int x;
        int y;
        int distaq;
        int idx;

        public point(int x,int y,int distaq,int idx){
            this.x=x;
            this.y=y;
            this.distaq=distaq;
            this.idx=idx;
        }
        @Override
        public int compareTo(point p2){
            return this.distaq-p2.distaq;
        }
    }
    public static void main (String[] args){
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distaq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], distaq,i));
        }
        for(int i=0;i<k;i++){
            point p=pq.remove();
            System.out.println("c"+p.idx);
        }
    }
} 