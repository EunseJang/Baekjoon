package Bronze;
import java.util.*;

class B2908 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    // 1. 일단 입력 받음
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    // 2. 문자열로 변환함
    StringBuffer str1 = new StringBuffer(Integer.toString(a));
    StringBuffer str2 = new StringBuffer(Integer.toString(b));

    // 3. 변환한거 거꾸로 돌림
    String temp1 = str1.reverse().toString();
    String temp2 = str2.reverse().toString();

    // 4. 거꾸로 한거 다시 숫자로 바꿈
    int aa = Integer.parseInt(temp1);
    int bb = Integer.parseInt(temp2);

    if(aa > bb){
      System.out.println(aa);
    }
    else{
      System.out.println(bb);
    }
  }
}
