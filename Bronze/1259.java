package Bronze;

import java.util.*;

class B1259 {
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    Queue<String> answer=new LinkedList<String>();
    String [] result=new String[answer.size()];
    String str="";

    while(true){
      str=scanner.nextLine();

      if (str.equals("0")==true){
        break;
      }

      StringBuffer sb=new StringBuffer(str);
      String reversedStr=sb.reverse().toString();

      if(str.equals(reversedStr)==true){
        answer.offer("yes");
      }
      else{
        answer.offer("no");
      }
    }

    while(!answer.isEmpty()){
      System.out.println(answer.poll());
    }
  }
}