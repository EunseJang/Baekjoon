package Bronze;

import java.io.*;
import java.util.*;

class B23881 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    int K=Integer.parseInt(st.nextToken());
    int [] A = new int[N+1];

    st=new StringTokenizer(br.readLine());
    for (int i=1;i<=N;i++){
      A[i]=Integer.parseInt(st.nextToken());
    }

    int count = 0;
    for (int last=N;last>1;last--){
      int max = A[0];
      int maxIdx = 0;
      for (int i=1;i<=last;i++){
        if(max < A[i]){
          max = A[i];
          maxIdx = i;
        }
      }
      if(last!=maxIdx){
        int temp = A[last];
        A[last] = A[maxIdx];
        A[maxIdx] = temp;
        count ++;
        
        if(count == K){
          System.out.println(A[maxIdx]+" "+A[last]);
          System.exit(0);
        }
      }
    }
    if(count!=K){
      System.out.println(-1);
    }
  }
}