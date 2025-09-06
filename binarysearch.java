public class binarysearch{
    public static int binarysearch(int n[],int Key){
        int start=0,end=n.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (n[mid]== Key){
                return mid; 
            }
            if (n[mid]<Key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;
        System.out.println("index of key  : "+binarysearch(n, key));
    }
}