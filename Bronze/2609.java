package Bronze;

import java.util.*;

class B2609 {
  public static int gcd(int a, int b){ // 최대 공약수
    int temp;

    while(b!=0){
      temp=a%b;
      a=b;
      b=temp;
    }
    return a;
  }

  public static int lcm(int a, int b){ // 최소 공배수
    return a*b/gcd(a,b);
  }

  public static void main (String[] args){
    Scanner scanner=new Scanner(System.in);

    int A=scanner.nextInt();
    int B=scanner.nextInt();

    System.out.println(gcd(A,B));
    System.out.println(lcm(A,B));
  }
}
