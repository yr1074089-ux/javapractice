interface Person{
    void display();
}
class students implements Person{
    public void display(){
        System.out.println("basics of interface implementation");
    }
    public void input(){
        System.out.println("java");
    }
    public static void main(String[]args){
        students bbd=new students();
        bbd.display();
        bbd.input();
    }
}