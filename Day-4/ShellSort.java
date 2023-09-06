import java.util.Arrays;
 

public class ShellSort {
    public static<T extends Comparable<T>> void sort(T []arr){
     

        int h=1;
        final int N=arr.length;
        //This is used to select highest value of h-sorted array 
        while(h<N/3) h=3*h+1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&less(arr[j],arr[j-h]);j-=h){
                    exch(arr,j,j-h);
                }
            }
          
            System.out.println(h+"-sorted: "+Arrays.toString(arr));
               h=h/3;
        }

    }

    private static <T extends Comparable<T>>  boolean less(T v, T w ){
        return v.compareTo((T)w)<0; 
     }
 
     private static  <T extends Comparable<T>>void exch(T []a, int i, int j){
         T swap=a[i];
         a[i]=a[j];
         a[j]=swap;   
     }

     public static void main(String []args){
        Character[] ch=new Character[]{'s','h','i','v','a','s','r','i','v','a','s','t','a','v','a'};
        System.out.println(Arrays.toString(ch));
        sort(ch);
     }
}
