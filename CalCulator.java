class CalCulator{
    int a=10;
    int b=20;
    void add(){
        int c=a+b;
        System.out.println(c);
    }
    void sub(){
        int d=a-b;
        System.out.println(d);
    }
    void mul(){
        int e=a*b;
        System.out.println(e);
    }
    void div(){
        int f=a*b;
    }
    public static void main(String[] args) {
        CalCulator Action=new CalCulator();
        Action.add();
        Action.sub();
        Action.mul();
        Action.div();
    }
}