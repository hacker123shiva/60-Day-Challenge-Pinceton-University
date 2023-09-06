import java.util.Arrays;

public class Main{
    public static void main(String []args){
        Object n[]=new Integer[]{1,2,3};

        Integer a[]=(Integer[])n;
        help(3,4,5,6);
    }

    public static void help(int ...a){
        for(int x:a){
            System.out.println(x);
        }
    }
}