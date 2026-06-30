class ParentInheritance {
//     int a = 10;
//     int b = 20;
// }

// class Child extends ParentInheritance {
//     int c = 0;

//     void display() {
//         c = a + b;
//         System.out.println(c);
//     }

//     public static void main(String[] args) {
//         Child bbd = new Child();
//         bbd.display();
//     }
int a=10;
int b=20;
}
class Father extends ParentInheritance{
    int c=0;
}
class child extends Father{
    void display(){
        c=a+b;
        System.err.println(c);
    }
    public static void main(String[] args) {
        child bbd=new child();
        bbd.display();
    }
}