package Bronze;

import java.io.*;
import java.util.*;

class B2738 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    int M=Integer.parseInt(st.nextToken());

    int arr[][] = new int[N*2][M];
    for(int i=0;i<N*2;i++){
      st=new StringTokenizer(br.readLine());
      for (int j= 0;j<M;j++){
        arr[i][j]=Integer.parseInt(st.nextToken());
      }
    }

    for(int i=0;i<N;i++){
      for (int j= 0;j<M;j++){
        arr[i][j]+=arr[i+N][j];
        bw.write(arr[i][j]+ " ");
      }
      bw.write("\n");
    }
    bw.flush();
    bw.close();
  }
}
