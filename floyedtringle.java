public class floyedtringle{
    public static void floyedtringle(int n ){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyedtringle(10);
    }
}