package Bronze;

import java.util.*;

class B10870 {
  public static int fib(int n) {
    if(n==1){
      return 0;
    }
    else if(n==2){
      return 1;
    }
    else{
      return fib(n-1)+fib(n-2);
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num= scanner.nextInt();
    System.out.println(fib(num+1));
  }
}
