package Bronze;

import java.util.*;

class B10872 {
  public static int factorial(int num){
    if(num==0){
      return 1;
    }
    else{
      return num*factorial(num-1);
    }
  }

  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int N=scanner.nextInt();
    System.out.println(factorial(N));
  }
}
