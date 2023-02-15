package Silver;

import java.util.*;

class S10773 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    Stack<Integer> stack=new Stack<>();
    int test=scanner.nextInt();

    for(int i=0;i<test;i++){
      int num=scanner.nextInt();
      if(num==0){
        stack.pop();
      }
      else{
        stack.push(num);
      }
    }

    int sum=0;

    for(int i=0;i<stack.capacity();i++){
      if(stack.isEmpty()){
        break;
      }
      else{
        sum+=stack.peek();
      }
      stack.pop();
    }
    System.out.println(sum);
  }
}
