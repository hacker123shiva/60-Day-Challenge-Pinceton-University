 

public class ResizingArrayStackOfStrings implements StackApi{
   private String []s;
   private int N=0;


   public ResizingArrayStackOfStrings(int capacity){
    s=new String[capacity];
   }
    @Override
    public void push(String item) {
        if(N==s.length){
            resize(2*(s.length));
        }
        s[N++]=item;
    }

    private void resize(int capacity) {
       String str[]=new String[capacity];
       for(int i=0;i<s.length;i++){
        str[i]=s[i];
       }
       s=str;
    }

    @Override
    public String pop() {
      if(N!=0){
        String item=s[N--];
        s[N]=null;
        if(N==s.length/4)
        resize(s.length/4);
        return item;
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

    // public static void main(String []args){
    //     ResizingArrayStackOfStrings f=new  ResizingArrayStackOfStrings(10);
    //     f.push("shiva");
    //     f.push("harsh");
    //     f.push("abhi");
    //       f.push("shiva");
    //     f.push("harsh");
    //     f.push("abhi");
    //       f.push("shiva");
    //     f.push("harsh");
    //     f.push("abhi");
    //       f.push("shiva");
    //     f.push("harsh");
    //     f.push("abhi");
    //     System.out.println(f);
       
    //     System.out.println(f);
    // }
}

class StackFullException extends RuntimeException{
    public StackFullException(String message){
        super(message);
    }
}