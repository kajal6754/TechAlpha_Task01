class RemoveDuplicate{
public static int RemoveDup(int[] arr, int n){
      int[] temp = new int[n];
      int j=0;
      for(int i=0;i<n-1;i++){
       if(arr[i]!=arr[i+1])
        temp[j++]=arr[i];
      }
       for(int k=0;k<n-1;k++){
        arr[k] = temp[k];
       }
      return j;
    }
   public static void main(String[] args){
     int[] arr ={1, 2, 2, 3, 3, 4, 5 } ;
      int n=RemoveDup(arr,7);
      for(int i=0;i<n;i++){
       System.out.println(arr[i]+" ");
      }
   }
   
}