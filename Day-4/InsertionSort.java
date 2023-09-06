import java.util.Arrays;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T []arr){
         for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(less(arr[j],arr[j-1])){
                    exch(arr,j,j-1);
                }
                else break;
            }
         }
    }
    private  static <T extends Comparable<T>> boolean less(T v,T w){
        return v.compareTo(w)<0;
    }

    private static <T extends Comparable<T>> void exch(T []arr,int i, int j){
        T swap=arr[i];
        arr[i]=arr[j];
        arr[j]=swap;
    }

    public static void main(String []args){
        String []arr=new String[]{"shiva","harsh","muskan","arjun","tanish","arya"};
        System.out.println(Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
