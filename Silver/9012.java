package Silver;

import java.util.*;

class S9012 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int test = scanner.nextInt();
    
    for(int i=0;i<test;i++){
      String result="YES";
      Stack<String> stack=new Stack<>();
      String str=scanner.next();
      for(int j=0;j<str.length();j++){
        if(str.charAt(j)=='('){
          stack.push("(");
        }
        else{
          if(stack.isEmpty()){
            result="NO";
            break;
          }
          else{
            stack.pop();
          }
        }
      }

      if(result.equals("YES")&&stack.isEmpty()){
        result="YES";
      }
      else{
        result="NO";
      }
      System.out.println(result);
    }
  }
}
