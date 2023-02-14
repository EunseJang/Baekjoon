package Bronze;

import java.util.*;

class B1085 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int w = scanner.nextInt();
    int h = scanner.nextInt();

    int []min=new int[4];

    min[0]=w-x;
    min[1]=h-y;
    min[2]=x;
    min[3]=y;

    Arrays.sort(min);
    System.out.println(min[0]);
  }
}
