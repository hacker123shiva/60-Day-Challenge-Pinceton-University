public class DateComparable implements Comparable<DateComparable>{

    private final int month, day, year;
    public DateComparable(int m, int d, int y){
        month =m;
        day=d;
        year=y;
    }
 
    public   int compareTo(DateComparable that) {
        if(this.year<that.year)return -1;
        if(this.year>that.year)return 1;
        if(this.month<that.month) return -1;
        if(this.month>that.month) return 1;
        if(this.day<that.day) return -1;
        if(this.day>that.day) return 1;
        else
        return 0;
    }
    
     public static  boolean less(Comparable<DateComparable> v, Comparable<DateComparable> w){
        return v.compareTo((DateComparable)w)<0;
     }

    public static void main(String []args){
        DateComparable obj1=new DateComparable(12, 1, 2000);
        DateComparable obj2=new DateComparable(11, 13, 2002);
       System.out.println( DateComparable.less(obj1,obj2));
    }
}

 

// class A implements B{
//     int a=5;
// public void alpha(){
//     System.out.println(this.a);
//     twin();
// }

// public void twin(){
//     System.out.println("i am not a twin");
// }

// public static void main(String []args){
//     B obj=new A();
//     obj.alpha();
//     // obj.twin();
// }
// }

// interface B{
//     void alpha();
// }