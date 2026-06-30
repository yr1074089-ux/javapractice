public class PERSON {
    // void display(int x,int y){
    //     System.out.println(x+y);
    // }
    // void display(int x,int y,int z){
    //     System.out.println(x+y+z);
    // }
    // public static void main(String[] args) {
    //     PERSON j=new PERSON();
    //     j.display(2, 4);
    //     j.display(2,4 ,8);
    // }
    // void display(int x,int y){
    //     if(x>y){
    //         System.out.println(x);
    //     }else{
    //         System.out.println(y);
    //     }
    // }
    // void display(float x,float  y){
    //     if(x>y){
    //         System.out.println(x);
    //     }else{
    //         System.out.println(y);
    //     }
    // }
    // void display(int x,char y){
    //     System.out.println(x+" "+y);
    // }
    // void display(char x,int y){
    //     System.out.println(x+" "+y);
    // }
    // public static void main(String[] args) {
    //     PERSON f=new PERSON();
    //     f.display(4,'a');
    //     f.display('b', 7);
    // }
    // void display(){
    //     System.out.println("hello");
    //     }
    // }
    // class A extends PERSON{
    //     void display(){
    //         System.out.println("hello A");
    //     }
    // }
    // class B extends PERSON{
    //     void display(){
    //         System.out.println("hello B");
    //     }
    // public static void main(String[] args) {
    //     PERSON sc=new PERSON();
    //     A m =new A();
    //     B n =new B();
    //     PERSON z;
    //     z=m;
    //     z.display();
    //     z=n;
    //     z.display();
    // }
    // this key word example 
    int a; 
    int b;
    void display(int a,int b){
        this.a=a;
        this.b=b;

        System.out.println(a+b);
    }
    public static void main(String[] args) {
        PERSON d=new PERSON();
        d.display(2, 8);
    }
}
