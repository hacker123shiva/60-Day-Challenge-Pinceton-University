import java.util.Arrays;

public class InsertionSort {
    public static <T extends Comparable<T>> void sortRange(T []a, int start, int end){
     for(int i=start+1;i<=end;i++){
        for(int j=i;j>start;j--){
            if(less(a[j],a[j-1])){
                exch(a,j,j-1);
            }
            else break;
        }
     }
    }
    private static <T extends Comparable<T>> boolean less(T v, T w){
        return v.compareTo(w)<0;
     }

    private static <T extends Comparable<T>> void exch(T [] a, int  i, int j){
        T swap= a[i];
        a[i]=a[j];
        a[j]=swap;
    }

    public static  void main(String []args){
         String []name={"shiva","arjun","satyam","karan","muskan","tanya","rahul","riya","suraj","raj","abhimanyu"};
    System.out.println(Arrays.toString(name));
     sortRange(name, 2, 5);

  System.out.println(Arrays.toString(name));
    }
}
