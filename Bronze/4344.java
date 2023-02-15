package Bronze;

import java.util.*;

class B4344 {
   public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    int T = scanner.nextInt();

    for(int i=0;i<T;i++){
      int N=scanner.nextInt();
      int [] arr= new int[N];
      int sum=0;
      for(int j=0;j<N;j++){
        arr[j]=scanner.nextInt();
        sum+=arr[j];
      }

      double avg=sum/N;
      double count=0;

      for(int k=0;k<N;k++){
        if(arr[k]>avg){
          count++;
        }
      }
      double temp =count/N*100;
      System.out.println(String.format("%.3f",temp)+"%");
    }
  } 
}