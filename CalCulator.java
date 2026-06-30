class CalCulator{
    // void add(int a, int b){
    //     int c=a+b;
    //     System.out.println(c);
    // }
    // void sub(int a ,int b){
    //     int d=a-b;
    //     System.out.println(d);
    // }
    // void mul(int a, int b){
    //     int e=a*b;
    //     System.out.println(e);
    // }
    // void div(int a,int b){
    //     int f=a/b;
    //     System.out.println(f);
    // }
    // public static void main(String[] args) {
    //     CalCulator Action=new CalCulator();
    //     Action.add(10,12);
    //     Action.sub(20,10);
    //     Action.mul(2,3);
    //     Action.div(25,5);
    // }
    static int c=0;
    static int a=10,b=21;
    static void add(){
        c=a+b;
        System.err.println(c);
    }
    public static void main(String[] args) {
        add();
    }
}