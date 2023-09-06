import java.util.Arrays;
import edu.princeton.cs.algs4.StopwatchCPU;
class MergeSort{
    private static final int CUTT_OF=7;
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
      

        if(hi-lo<=CUTT_OF-1){
            InsertionSort.sortRange(a, lo, hi);
            return;
        }

     int mid=lo+(hi-lo)/2;
     sort(a,aux,lo,mid);
     sort(a,aux,mid+1,hi);
     if(less(a[mid],a[mid+1])){ //if last element of partial ordered sorted array is less than first element of another partial ordered sorted array
        return;
     }
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
    StopwatchCPU stopwatch1=new StopwatchCPU();
    String []name={"shiva","arjun","satyam","karan","muskan","tanya","rahul","riya","suraj","raj","abhimanyu",  
   "John Smith", "Emily Johnson", "Michael Williams", "Sophia Brown", "William Jones",
    "Olivia Garcia", "James Miller", "Emma Davis", "David Rodriguez", "Ava Martinez",
    
    "Liam Anderson", "Charlotte White", "Benjamin Lee", "Amelia Martin", "Henry Lewis",
    "Mia Hall", "Alexander Allen", "Ella Young", "Sebastian Clark", "Lily Turner",
    "Ethan Rodriguez", "Harper Scott", "Matthew Walker", "Grace Perez", "Lucas King",
    "Chloe Martinez", "Jackson Hall", "Zoe Johnson", "Samuel Miller", "Nora Davis",
    "Aiden Wilson", "Riley Thomas", "Logan Turner", "Layla Harris", "Muhammad Martinez",
    "Scarlett White", "Daniel Allen", "Victoria Turner", "Asher Carter", "Madison Rivera",
    "Joseph Perez", "Aria Lewis", "Carter Hughes", "Grace Adams", "Owen Alexander",
    "Eleanor Nelson", "Mateo Cooper", "Hannah Turner", "Wyatt Brooks", "Addison Young",
    
       "Avery Foster", "Elizabeth Bennett", "Leo Richardson", "Sofia Jenkins", "Daniel Cooper",
    "Ella Johnson", "Henry Murphy", "Luna Parker", "Liam Mitchell", "Ava Turner",
    "Jack Wright", "Aria Gray", "Caleb Baker", "Lily Adams", "Muhammad Russell",
    "Grace Fisher", "Ethan Simmons", "Zoe Foster", "Owen Morris", "Harper Ross",
    "Mason Parker", "Nora Campbell", "Oliver Price", "Emily Stewart", "Carter Bailey",
    "Sophia Hayes", "Sebastian Powell", "Mia Hayes", "Theodore Bennett", "Evelyn Rogers",
     
     "John Smith", "Emily Johnson", "Michael Williams", "Sophia Brown", "William Jones",
    "Olivia Garcia", "James Miller", "Emma Davis", "David Rodriguez", "Ava Martinez",
    "Liam Anderson", "Charlotte White", "Benjamin Lee", "Amelia Martin", "Henry Lewis",
    "Mia Hall", "Alexander Allen", "Ella Young", "Sebastian Clark", "Lily Turner",
     
    "Ethan Rodriguez", "Harper Scott", "Matthew Walker", "Grace Perez", "Lucas King",
    "Chloe Martinez", "Jackson Hall", "Zoe Johnson", "Samuel Miller", "Nora Davis",
     
    "Avery Foster", "Elizabeth Bennett", "Leo Richardson", "Sofia Jenkins", "Daniel Cooper",
    "Ella Johnson", "Henry Murphy", "Luna Parker", "Liam Mitchell", "Ava Turner",
    "Jack Wright", "Aria Gray", "Caleb Baker", "Lily Adams", "Muhammad Russell",
     
    "Avery Foster", "Elizabeth Bennett", "Leo Richardson", "Sofia Jenkins", "Daniel Cooper",
    "Ella Johnson", "Henry Murphy", "Luna Parker", "Liam Mitchell", "Ava Turner",
    "Jack Wright", "Aria Gray", "Caleb Baker", "Lily Adams", "Muhammad Russell",
  
    "Ethan Rodriguez", "Harper Scott", "Matthew Walker", "Grace Perez", "Lucas King",
    "Chloe Martinez", "Jackson Hall", "Zoe Johnson", "Samuel Miller", "Nora Davis",
     
    "Avery Foster", "Elizabeth Bennett", "Leo Richardson", "Sofia Jenkins", "Daniel Cooper",
    "Ella Johnson", "Henry Murphy", "Luna Parker", "Liam Mitchell", "Ava Turner",
    "Jack Wright", "Aria Gray", "Caleb Baker", "Lily Adams", "Muhammad Russell",
    
    "Avery Foster", "Elizabeth Bennett", "Leo Richardson", "Sofia Jenkins", "Daniel Cooper",
    "Ella Johnson", "Henry Murphy", "Luna Parker", "Liam Mitchell", "Ava Turner",
    "Jack Wright", "Aria Gray", "Caleb Baker", "Lily Adams", "Muhammad Russell",
   
    "Oliver Carter", "Aurora Cooper", "Eli Collins", "Luna Wood", "Logan Ward",
    "Ella Barnes", "Leo Hall", "Mila Mitchell", "Carter Adams", "Eleanor Hughes"
   };
    System.out.println(Arrays.toString(name));
    sort(name);
  System.out.println(Arrays.toString(name));
  double elsTime1=stopwatch1.elapsedTime();
  System.out.println("Time Required by Improve version of MergeSort: "+elsTime1);

  System.out.println();

   StopwatchCPU stopwatch2=new StopwatchCPU();
    System.out.println(Arrays.toString(name));
    MergeSort.sort(name);
  System.out.println(Arrays.toString(name));
  double elsTime2=stopwatch2.elapsedTime();
  System.out.println("Time Required by general MergeSort: "+elsTime2);
   }

}