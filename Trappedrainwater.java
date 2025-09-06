public class Trappedrainwater{
    public static int trappedRainwater(int hight[]){
        int n=hight.length;
        int leftMax[]=new int[n];
        leftMax[0]=hight[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(hight[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=hight[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(hight[i],rightMax[i+1]);
        }
        int trappedwater=0;
        for(int i=0; i<n; i++){
            int waterlevel =Math.min(leftMax[i],rightMax[i]);
            trappedwater += waterlevel-hight[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int hight[]={4,2,0,6,3,2,5};
        System.out.println("trapped water : "+trappedRainwater(hight));
    }
}