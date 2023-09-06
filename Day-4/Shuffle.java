import java.util.Arrays;
import java.util.Random;

public class Shuffle {
   private static Random random=new Random();
    public static  <T extends Object> void exch(T []arr,int i ,int j){
        T swap=arr[i];
        arr[i]=arr[j];
        arr[j]=swap;
    }

    public static <T extends Object> void shuffle(T []arr){

        for(int i=0;i<arr.length;i++){
           int r=random.nextInt(i+1);
        //    System.out.println("Random r: "+r);
           exch(arr,i,r);
        }
    }

    public static void main(String []args){
        String []names={"shiva","harsh","arjun","raj","ritesth","abhimanyu","avi","sanjiv"};
        System.out.println(Arrays.toString(names));
        shuffle(names);
        System.out.println(Arrays.toString(names));
    }
}
