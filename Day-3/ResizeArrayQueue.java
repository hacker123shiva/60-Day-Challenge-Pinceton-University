 

public class ResizeArrayQueue{
    private int head=0;
    private int tail=0;
    private String []q;

    public ResizeArrayQueue(int capacity){
        q=new String[capacity];
    }

    public void enqueue(String item){
        if(tail!=q.length){
           q[tail++]=item;
        }
        else{
            resize((tail-head)*2+1);
        }
    }
   

    public void resize(int capacity){
      String qNew[]=new String[capacity];
      for(int i=head;i<tail;i++){
        qNew[i-head]=q[i];
      }
      q=qNew;
    }


    public String dequeue(){
        String item=null;
        if(tail!=head){
         item=q[head++];
        }
return item;
    }

public int size(){
    return tail-head;
}

public boolean isEmpty(){
    return head==tail;
}

public String toString(){
    String str="[";
    for(int i=head;i<tail;i++){
str+=q[i]+", ";
    }
    str+="]";
    return str;
}
    public static void main(String []args){
       ResizeArrayQueue f=new ResizeArrayQueue(3);
       System.out.println(f.isEmpty());
       f.enqueue("shiva");
       f.enqueue("harsh");
       f.enqueue("arjun");
       f.enqueue("muskan");
       f.enqueue("raj");
       System.out.println(f);
       System.out.println(f.size());
       System.out.println(f.isEmpty());
       String item=f.dequeue();
       System.out.println(item);
        System.out.println(f);
       System.out.println(f.size());
       System.out.println(f.isEmpty());

    }
}
