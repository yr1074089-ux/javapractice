// interface Person{
//     void display();
// }
// class students implements Person{
//     public void display(){
//         System.out.println("basics of interface implementation");
//     }
//     public void input(){
//         System.out.println("java");
//     }
//     public static void main(String[]args){
//         students bbd=new students();
//         bbd.display();
//         bbd.input();
//     }
// }
interface Father{
    void input1();
}
interface Mother{
    void input2();
}
class child implements Father,Mother{
    public void input1(){
        System.out.print("hello");
    }
    public void input2(){
        System.out.print("World");
    }
    public static void main(String[] args) {
        child bbd=new child();
        bbd.input1();
        bbd.input2();
    }
}