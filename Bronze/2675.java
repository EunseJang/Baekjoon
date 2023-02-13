package Bronze;

import java.util.*;

class B2675 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int test = scanner.nextInt();

    for(int i=0;i<test;i++){
      int num=scanner.nextInt();

      String str=scanner.next();
      
      for(int j=0;j<str.length();j++){
        for(int k=0;k<num;k++){
          System.out.print(str.charAt(j));
        }
      }
      System.out.println();
    }
  }
}
