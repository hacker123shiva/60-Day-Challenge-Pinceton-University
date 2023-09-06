public class FixedCapacityStackOfString implements StackApi{
   private String []s;
   private int N=0;


   public FixedCapacityStackOfString(int capacity){
    s=new String[capacity];
   }
    @Override
    public void push(String item) {
        if(N<s.length){
            s[N++]=item;
        }
        else{
            try{

        throw new StackFullException("Your capacity is full");
            }
            catch(StackFullException e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String pop() {
        if(!isEmpty()){
            String str=s[--N];
            s[N]=null;
            return str;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
       if(N==0){
        return true;
       }
       return false;
    }

    @Override
    public int size() {
         return N;
    }
    
    public String toString(){
        String st="[";
        for(String str:s){
       if(str==null)
       break;
       st+=str+", ";
        }
        st+="]";
        return st;
    }

    public static void main(String []args){
        FixedCapacityStackOfString f=new FixedCapacityStackOfString(10);
        f.push("shiva");
        f.push("harsh");
        f.push("abhi");
          f.push("shiva");
        f.push("harsh");
        f.push("abhi");
          f.push("shiva");
        f.push("harsh");
        f.push("abhi");
          f.push("shiva");
        f.push("harsh");
        f.push("abhi");
        System.out.println(f);
       
        System.out.println(f);
    }
}

class StackFullException extends RuntimeException{
    public StackFullException(String message){
        super(message);
    }
}