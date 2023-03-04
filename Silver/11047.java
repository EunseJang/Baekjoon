package Silver;

import java.io.*;
import java.util.*;

class S11047 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    int K=Integer.parseInt(st.nextToken());

    int [] coin = new int[N];

    for (int i=0;i<+N;i++){
      st = new StringTokenizer(br.readLine());
      coin[i] = Integer.parseInt(st.nextToken());
    }

    int count = 0;
    for (int i=N-1;i>=0;i--){
      if (coin[i]<=K){
        count += (K/coin[i]);
        K = K % coin[i];
      }
    }

    bw.write(Integer.toString(count));
    bw.flush();
    bw.close();
  }
}