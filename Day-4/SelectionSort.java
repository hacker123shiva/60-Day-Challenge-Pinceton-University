import java.util.Arrays;

public class SelectionSort {
    public static<T extends Comparable<T>> void sort(T []a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(less(a[j],a[min])){
                    min=j;
                }
            }
            exch(a,i,min);
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
        int []arr=new int[]{19,20,175,9,11,13,13};
        Integer []arrr=Arrays.stream(arr).boxed().toArray(Integer[]::new);
         System.out.println(Arrays.toString(arr));
        sort(arrr);
        System.out.println(Arrays.toString(arrr));
    }
}
