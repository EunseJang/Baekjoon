package Silver;

import java.io.*;
import java.util.*;

class S2667 {
  static ArrayList<Integer> graph = new ArrayList<>();
  static int count =0; // 단지 수
  static int dx[] = {0,0,1,-1};
  static int dy[] = {1,-1,0,0};
  static int map [][];
  static int N;

  public static boolean dfs(int x, int y){
    if(x<0 || x>=N || y<0 || y>=N){
      return false;
    }
    if(map[x][y]==1){
      count+=1;
      map[x][y]=0;
      for (int i=0;i<4;i++){
        dfs(x+dx[i], y+dy[i]);
      }
      return true;
    }
    return false;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N=Integer.parseInt(st.nextToken());
    map = new int[N][N];
    for(int i=0;i<N;i++){
      String temp = br.readLine();
      for(int j=0;j<N;j++){
        map[i][j]=Integer.parseInt(temp.substring(j,j+1));
      }
    }

    for (int i=0;i<N;i++){
      for (int j=0;j<N;j++){
        if(dfs(i,j)==true){
          graph.add(count);
          count =0;
        }
      }
    }

    Collections.sort(graph);
    System.out.println(graph.size());
    for (int x:graph){
      System.out.println(x);
    }
  }
}