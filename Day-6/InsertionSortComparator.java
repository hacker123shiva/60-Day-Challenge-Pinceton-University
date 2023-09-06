import java.util.Arrays;
import java.util.Comparator;

public class InsertionSortComparator {
    
    public static <T>  void sort(Comparator<T> comparator ,T []a){
     for(int i=0;i<a.length;i++){
        for(int j=i;j>0;j--){
            if(less(comparator,a[j],a[j-1])){
                exch(a,j,j-1);
            }
            else break;
        }
     }
    }
    private static  <T> boolean less(Comparator<T> comparator, T v, T w){
        return  comparator.compare(v,w)<0;
     }

    private static  <T> void exch(T[] a, int  i, int j){
        T swap= a[i];
        a[i]=a[j];
        a[j]=swap;
    }


    public static  void main(String []args){
        Student []students=new Student[]{new Student("shiva",21),new Student("harsh",21),new Student("arjun",22),new Student("muskan",21),new Student("shivam",25)};
        System.out.println(students);
       System.out.println(Arrays.toString(students));
       sort(Student.BY_NAME,students);
       System.out.println(Arrays.toString(students));
       sort(Student.BY_AGE, students);
       System.out.println(Arrays.toString(students));
    }

}

 
