public class getshort{
    public static float getShortestpath(String path){
        int x=0, y=0;
        for (int i = 0; i <path.length(); i++) {
            char dir =path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if (dir=='N'){
                y++;
            }
            else if(dir=='W'){
                y--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return(float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="WN";
        System.out.println("get shortest path: "+getShortestpath(path));
    }
}