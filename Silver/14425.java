package Silver;

import java.io.*;
import java.util.*;

class S14425 {
  public static void main(String[] args) throws IOException{
    Scanner scanner= new Scanner(System.in);
    int N=scanner.nextInt();
    int M=scanner.nextInt();

    String arrN[]=new String[N];
    String arrM[]=new String[M];

    for(int i=0;i<N;i++){
      arrN[i]=scanner.next();
    }
    for(int i=0;i<M;i++){
      arrM[i]=scanner.next();
    }

    int count=0;
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        if(arrN[i].equals(arrM[j])){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}