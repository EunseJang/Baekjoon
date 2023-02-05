package Bronze;
import java.util.*;

class B10818 {
  public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    int size=scanner.nextInt(); 
    int [] num=new int[size];

    for(int i=0;i<size;i++){
      num[i]=scanner.nextInt();
    }

    int max=num[0];
    int min=num[0];

    for (int i=0;i<size;i++){
      if(num[i]>max){
        max=num[i];
      }
      if(num[i]<min){
        min=num[i];
      }
    }
    System.out.println(min+" "+max);
  }
}
