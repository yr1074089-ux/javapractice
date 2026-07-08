
public class PlusMinusope {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int divide(int a, int b) {
        if(b==0){
            System.out.println("can not devidede by zero");
            return 0;
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("multiply: "+ multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }
}
