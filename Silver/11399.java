package Silver;

import java.io.*;
import java.util.*;

class S11399 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    int [] p = new int[N+1];

    st = new StringTokenizer(br.readLine());
    for(int i=1;i<=N;i++){
      p[i]= Integer.parseInt(st.nextToken());
    }

    Arrays.sort(p);
    for(int i=1;i<=N;i++){
      p[i]+=p[i-1];
    }

    bw.write(Integer.toString(Arrays.stream(p).sum()));
    bw.flush();
    bw.close();
  }
}