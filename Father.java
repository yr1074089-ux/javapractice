class Father{
    int a=32;
    int b=28;
}
class child1 extends Father{
    int c=0;
    void display(){
        c=a+b;
        System.out.println(c);
    }
}
class child2 extends Father{
    int c=0;
    void display(){
        c=a+b;
        System.out.println(c);
    }
}
class child3 extends Father{
    int c=0;
    void display(){
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        child1 bbd =new child1();
        bbd.display();
        child2 sc=new child2();
        sc.display();
        child3 g=new child3();
        g.display();
    }
}
