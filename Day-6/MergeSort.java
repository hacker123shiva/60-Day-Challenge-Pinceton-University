import java.util.Arrays;

public class MergeSort{
    private static <T extends Comparable<T>> void merge(T [] a, T []aux, int lo, int mid, int hi){
     for(int i=lo;i<=hi;i++){
        aux[i]=a[i]; //copy element of a into aux from lo to hi
     }
      int i=lo;
      int j=mid+1;

    // merge logic 
     for(int k=lo;k<=hi;k++){
        if(i>mid) a[k]=aux[j++];
        else if(j>hi) a[k]=aux[i++];
        else if(less(aux[i],aux[j])){
             a[k]=aux[i++];
        }
        else{
            a[k]=aux[j++];
        }
     }
    }

    private static <T extends Comparable<T>> void sort(T[] a, T[] aux ,int lo,int hi ){
        if(hi<=lo){
            return;
        }
     int mid=lo+(hi-lo)/2;
     sort(a,aux,lo,mid);
     sort(a,aux,mid+1,hi);
     merge(a,aux,lo,mid,hi);
    }

   public static <T extends Comparable<T>> void sort(T []a){

    @SuppressWarnings("unchecked")
   T []aux=(T[])new Comparable[a.length];  //Since we cannot create the array of  generic type
    sort(a,aux,0,a.length-1);
   }

   private static <T extends Comparable<T>> boolean less(T v, T w){
      return v.compareTo(w)<0;
   }

   public static void main(String []args){
    String []name={"shiva","arjun","satyam","karan","muskan","tanya","rahul","riya","suraj","raj","abhimanyu"};
    System.out.println(Arrays.toString(name));
    sort(name);
  System.out.println(Arrays.toString(name));
   }

}