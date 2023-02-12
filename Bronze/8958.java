package Bronze;

import java.util.*;

class B8958 {
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    int test=scanner.nextInt();
    int []result= new int[test];
    String str;

    int temp=0;
    for (int i=0;i<test;i++){
      str=scanner.next();
      
      for (int j=0;j<str.length();j++){
        if (str.charAt(j)=='O'){
          temp ++;
          result[i]=result[i]+temp;
        }
        else{
          temp=0;
        }
      }
      temp=0;
    }

    for(int i=0;i<test;i++){
      System.out.println(result[i]);
    }
  }
}