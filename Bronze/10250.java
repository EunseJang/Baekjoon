package Bronze;

import java.util.*;

class B10250 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int test=scanner.nextInt();

    for(int i=0;i<test;i++){
      int H = scanner.nextInt();
      int W = scanner.nextInt();
      int N = scanner.nextInt();
      
      int YY;
      int XX;

      if(N%H==0){
        YY=H;
        XX=N/H;
      }
      else{
        YY=N%H;
        XX=N/H+1;
      }
      System.out.println(100*YY+XX);
    }
  }
}