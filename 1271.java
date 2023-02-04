import java.util.Scanner;
import java.math.BigInteger;

class B1271 {
  public static void main(String[] args){
    BigInteger money;
    BigInteger n;

    Scanner scanner=new Scanner(System.in);
    money=scanner.nextBigInteger();
    n=scanner.nextBigInteger();

    try{
      System.out.println(money.divide(n));
      System.out.println(money.remainder(n));
    }
    catch(ArithmeticException e){
      System.out.println("0으로 나눌 수 없습니다.");
    }
    scanner.close();
  }
}