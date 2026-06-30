class PARENT {
//     final void display(int a, int b){
//         System.out.println(a+b);
//     }
// }
// class CHILD extends PARENT{
//     void display(int a,int b){
//         System.out.println(a-b);
//     }
//     public static void main(String[] args) {
//         CHILD obj=new CHILD();
//         obj.display(2, 4);

//     }
    void display(){
        System.out.println("this is parent class");
    }
}
class Child extends PARENT{
    void dispaly(){
        super.display();
    // Child(){
    //     super();
        System.out.println("this is child class ");
    }
    public static void main(String[] args) {
        Child sc=new Child();
        sc.dispaly();
    }
}
