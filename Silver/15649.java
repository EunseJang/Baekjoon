package Silver;

import java.io.*;
import java.util.*;

class S15649 {
  public static int N,M;
  public static int [] arr;
  public static boolean[] visited;
  public static StringBuilder sb = new StringBuilder();

  public static void dfs(int vertex){
    if (vertex == M){
      for (int n: arr){
        sb.append(n).append(' ');
      }
      sb.append('\n');
      return;
    }

    for (int i=0;i<N;i++){
      if(!visited[i]){
        visited[i]=true;
        arr[vertex] = i+1;
        dfs(vertex+1);
        visited[i]=false;
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N=Integer.parseInt(st.nextToken());
    M=Integer.parseInt(st.nextToken());

    arr = new int[M];
    visited = new boolean[N];

    dfs(0);
    System.out.println(sb);
  }
}