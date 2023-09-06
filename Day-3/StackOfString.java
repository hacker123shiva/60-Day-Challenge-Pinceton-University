import edu.princeton.cs.algs4.StdIn;
 
public class StackOfString implements StackApi {
    Node last=null;

    @Override
    public void push(String item) {
        Node node=new Node();
        node.data=item;
        if(last!=null)
        {node.next=last;
        last=node;}
        else
        last=node;
    }

    @Override
    public String pop() {
     if(!isEmpty()){
        String str=last.data;
        last=last.next;
        return str;
     }
     return null;
    }

    @Override
    public boolean isEmpty() {
        if(last==null)
            return true;
        else 
            return false;
    }

    @Override
    public int size() {
        Node current =last;
        int count=0;
       while(current!=null){
        count++;
        current=current.next;
       }
       return count;
    }

    public String toString(){
        Node current =last;
        String str="]";
        while(current!=null){

        if(current==last)
        str=current.data+str;
        else
        str=current.data+", "+str;

        current=current.next;
       }
       str="["+str;
       return str;
    }
    private class Node{
        String data=null;
        Node next=null;
    }

    public static void main(String []args){
        StackOfString stack=new StackOfString();
        // stack.push("shiva");
        // stack.push("harsh");
        // stack.push("arjun");
        // stack.push("abhimanyu");
        
        
        // System.out.println(stack);
        // System.out.println(stack.size());
        // System.out.println(stack.pop());
        // System.out.println(stack);
        // System.out.println(stack.size());

        while(!StdIn.isEmpty()){
            String s=StdIn.readString();
            if(s.equals("-"))
             System.out.println(stack.pop()); 
             else
             stack.push(s);
        }
        System.out.println(stack); 

        
    }
    
}
