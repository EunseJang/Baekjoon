package Silver;

import java.io.*;
import java.util.*;

class S2559 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    int K=Integer.parseInt(st.nextToken());

    int [] arr = new int[N+1];
    st = new StringTokenizer(br.readLine());
    for(int i=1;i<=N;i++){
      arr[i]=Integer.parseInt(st.nextToken());
    }
    for(int i=1;i<=N;i++){
      arr[i]=arr[i-1]+arr[i];
    }

    int [] temp = new int[N-K+1];
    for(int i=0;i<N-K+1;i++){
      temp[i] = arr[K+i]-arr[i];
    }

    System.out.println(Arrays.stream(temp).max().getAsInt());
  }
}