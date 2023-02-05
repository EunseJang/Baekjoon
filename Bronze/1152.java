package Bronze;
import java.util.*;

class B1152 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    String str=scanner.nextLine();
    int count=0;
    
    for(int i=0;i<str.length();i++){
      if (str.charAt(i)==' '){
        count++;
      }
    }

    if(str.charAt(0)==' '){
      if(str.charAt(str.length()-1)==' '){
        System.out.println(count-1);
      }
      else{
        System.out.println(count);
      }
    }
    else if(str.charAt(str.length()-1)==' '){
      System.out.println(count);
    }
    else{
      System.out.println(count+1);
    }
  }
}
