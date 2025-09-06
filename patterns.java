public class patterns{
    public static void hollo_ractangle(int totrows, int totcolm){
        for(int i=1; i<=totrows; i++){
            for(int j=1; j<=totcolm; j++)   {
                if(i==1||i==totrows || j==1 || j==totcolm){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }    
    }
    public static void main(String[] args) {
        hollo_ractangle(4, 5);
    }
}