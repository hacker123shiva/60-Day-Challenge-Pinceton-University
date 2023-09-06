import java.util.Iterator;

public class InfixToPostfix {
    public int precedence(char ch){
     int pre= switch(ch){
        case '+','-'-> 1;
        case '*','/','%'->2;
        case '('->  3;
        case ')'->4;
        default ->-1;
    };
    return pre;
}

StackIterator<Character> postfix=new StackIterator<>();
StackIterator<Character> operator=new StackIterator<>();

public void infixToPostfixMethod(String str){
    Character ch=null;
    for(int i=0;i<str.length();i++){
       ch=str.charAt(i);

if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
       if(operator.get()!=null){
        if(precedence(ch)>precedence(operator.get())){
            operator.push(ch);
        }
       else{
        postfix.push(operator.pop());
        operator.push(ch);
       }
       }
       else{
        operator.push(ch);
       }

    }
else{
    postfix.push(ch);
}
}

while(!operator.isEmpty()){
    postfix.push(operator.pop());
}
}

public String toString(){
  Iterator<Character> itr = postfix.iterator();
  String str="";
  while(itr.hasNext()){
   str=Character.toString(itr.next())+str;
  }
  return str;
}
public static void main(String []args){
    InfixToPostfix post=new InfixToPostfix();
    post.infixToPostfixMethod("a+b*c/d%e");
   System.out.println(post);
}

}
