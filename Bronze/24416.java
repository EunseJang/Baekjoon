package Bronze;

import java.util.*;

class B24416 {
  static int count_re=1;
 public static int fib_recursion(int n){
    if (n==1||n==2){
      return 1;
    }
    else{
      count_re++;
      return (fib_recursion(n-1)+fib_recursion(n-2));
    }
  }
  
  public static int fib_dp(int n){
    int count_dp=0;
    if(n==1){
      count_dp=1;
    }
    else if(n==2){
      count_dp=2;
    }
    else{
      for(int i=3;i<=n;i++){
        count_dp++;
      }
    }
    return count_dp;
  }

  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    int n = scanner.nextInt();
    fib_recursion(n);
    System.out.println(count_re+" "+fib_dp(n));
  }
}
