package Bronze;

import java.util.*;
import java.lang.*;

class B2577 {
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    int A=scanner.nextInt();
    int B=scanner.nextInt();
    int C=scanner.nextInt();

    String result = Integer.toString(A*B*C);
    int count=0;

    for(int i=0; i<10;i++){
      for(int j=0;j<result.length();j++){
        if(result.charAt(j)==Character.forDigit(i, 10)){
           count ++;
        }
      }
      System.out.println(count);
      count=0;
    }
  }
}
