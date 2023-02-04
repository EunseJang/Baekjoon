package Bronze;
import java.util.Scanner;

class B2439{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int num=scanner.nextInt();

    for(int i=0; i<num; i++){
      for (int j=num;j>i+1;j--){
        System.out.print(" ");
      }
      for (int k=0;k<i+1;k++){
        System.out.print("*");
      }
      System.out.println("");
    }
    scanner.close();
  }
}