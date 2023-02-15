package Silver;

import java.util.*;

class S10828 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int test=scanner.nextInt();
    Stack stack=new Stack();
    
    StringBuilder sb = new StringBuilder();
    // println으로 출력하면 시간초과 나니까
    // StringBuilder 사용해야함

    for(int i=0;i<test;i++){
      String str=scanner.next();

      if(str.equals("push")){
        int num=scanner.nextInt();
        stack.push(num);
      }
      else if(str.equals("pop")){
        if(stack.isEmpty()){
          sb.append(-1).append('\n');
        }
        else{
          sb.append(stack.pop()).append('\n');
        }
      }
      else if(str.equals("size")){
        sb.append(stack.size()).append('\n');
      }
      else if(str.equals("empty")){
        if(stack.isEmpty()){
          sb.append(1).append('\n');
        }
        else{
          sb.append(0).append('\n');
        }
      }
      else if(str.equals("top")){
        if(stack.isEmpty()){
          sb.append(-1).append('\n');
        }
        else{
          sb.append(stack.peek()).append('\n');
        }
      }
    }
    System.out.print(sb);
  }
}
