import java.util.Iterator;

public class StackIterator<Item> implements Iterable<Item> {
   private Node last;

   private class Node{
    public Item item;
    public Node next;
   }

   public void push(Item item){
    Node node=new Node();
    node.item=item;
    if(isEmpty()){
      last=node;
    }
    else{
node.next=last;
last=node;
    }
    }
   

   public boolean isEmpty(){
    return last==null;
   }

   public Item pop(){
    Item item=null;
     if(!isEmpty())
     {
        item=last.item;
        last=last.next;
     }
     return item;
   } 

   public Item get(){
if(!isEmpty()){
    return last.item;
}
return null;
   }
   public int size(){
    Node current=last;
    int count=0;
  while(current!=null){
    count++;
    current=current.next;
  }
  return count;
   }
    @Override
    public Iterator<Item> iterator() {
       return new ApplyIterator ();
    }

    private class ApplyIterator implements Iterator<Item>{
Node current =last;
        @Override
        public boolean hasNext() {
 return current!=null;
        }

        @Override
        public Item next() {
            Item item=current.item;
            current=current.next;
            return item;
        }
       
    }

    // public static void main(String []args){
    //     StackIterator<String> s=new StackIterator<>();
    //     s.push("shiva");
    //     s.push("harsh");
    //     s.push("Navin");
    //     s.push("Arjun");
    //     s.push("Muskan");
          
    //     Iterator<String> iter=s.iterator();
    //     while(iter.hasNext()){
    //         String str=iter.next();
    //         System.out.println(str);
    //     }
    // }
    
}

 
