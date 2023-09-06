import java.util.Arrays;

public class NonRecursiveMergeSort {
      public static void main(String []args){
        Integer a[]=new Integer[]{31,4,15,61};
sort(a);
System.out.println(Arrays.toString(a));

    }
    private static <T extends Comparable<T>> boolean less(T v, T w){
        return v.compareTo(w)<0;
    }

    private static  <T extends Comparable<T>> void merge(T []a, T[]aux, int lo, int mid, int hi){
        for(int k=lo;k<=hi;k++){
            aux[k]=a[k];
        }
        int i=lo;
        int j=mid+1;
        for(int k=lo;k<=hi;k++){
            if(i>mid){
                a[k]=aux[j++];
            }
            else if(j>hi){
                a[k]=aux[i++];
            }
            else if(less(aux[i],aux[j])){
                a[k]=aux[i++];
            }
            else{
                a[k]=aux[j++];
            }
        }
    }

    public static  <T extends Comparable<T>> void sort(T []a){
        int N=a.length;
        @SuppressWarnings("unchecked")
        T []aux=(T[])new Comparable[N];
        for(int sz=1;sz<N;sz=sz+sz){
             for(int lo=0;lo<N-sz;lo+=sz+sz){
                merge(a,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
             }
        }

    }

   
}
