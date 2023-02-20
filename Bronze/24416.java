package Bronze;

import java.util.*;

class B24416 {
  static int count_re=0;
  static int count_dp=0;
  static int [] fib;
  
  public static int fib_re(int n){
    if (n==1||n==2){
      count_re++;
      return 1;
    }
    else{
      return (fib_re(n-1)+fib_re(n-2));
    }
  }
  
  public static int fib_dp(int n){
    fib[1]=1;
    fib[2]=2;

    for(int i=3;i<=n;i++){
      count_dp++;
      fib[n]=fib[n-1]+fib[n-2];
    }
    return fib[n];
  }

  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    int n = scanner.nextInt();
    fib = new int[n+1];

    fib_re(n);
    fib_dp(n);
    System.out.println(count_re+" "+count_dp);
  }
}
