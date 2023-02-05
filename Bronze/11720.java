package Bronze;
import java.util.*;

class B11720 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int num=scanner.nextInt();
    char []c=new char[num];
    int sum=0;

    String str=scanner.next();

    for(int i=0;i<num;i++){
      c[i]=str.charAt(i);
      sum=sum+Character.getNumericValue(c[i]);
    }
    System.out.println(sum);
  }
}
