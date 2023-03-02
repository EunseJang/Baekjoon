package Silver;

import java.io.*;
import java.util.*;

class S1260 {
  static int N,M,V;
  static ArrayList<ArrayList<Integer>> graph;
  static int [] dfs_ans;
  static int [] bfs_ans;
  static boolean [] dfs_visited;
  static boolean [] bfs_visited;
  static int dfs_count;
  static int bfs_count;

  public static void dfs (int v){
    for (int vertex: graph.get(v)){
      if(!dfs_visited[vertex]){
        dfs_ans[vertex]=dfs_count++;
        dfs_visited[vertex]=true;
        dfs(vertex);
      }
    }
  }

  public static void bfs (int v){
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v);

    while(!queue.isEmpty()){
      int temp = queue.poll();

      for (int vertex: graph.get(temp)){
        if(!bfs_visited[vertex]){
          bfs_ans[vertex]=bfs_count++;
          bfs_visited[vertex]=true;
          queue.offer(vertex);
        }
      }
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N=Integer.parseInt(st.nextToken());
    M=Integer.parseInt(st.nextToken());
    V=Integer.parseInt(st.nextToken());

    graph=new ArrayList<>();
    dfs_ans = new int[N+1];
    bfs_ans = new int[N+1];
    dfs_visited = new boolean[N+1];
    bfs_visited = new boolean[N+1];

    for(int i=0;i<=N;i++){
      graph.add(new ArrayList<>());
    }

    for (int i=0;i<M;i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    for (int i=1;i<=N;i++){
      Collections.sort(graph.get(i));
    }

    // dfs
    dfs_ans[V]=1;
    dfs_visited[V]=true;
    dfs_count = 2;
    dfs(V);
    StringBuilder dfs_sb = new StringBuilder();
    for(int i=1;i<=N;i++){
      for(int j=1;j<=N;j++){
        if (dfs_ans[j]==i){
          dfs_sb.append(j).append(' ');
          break;
        }
      }
    }
    System.out.println(dfs_sb);

    // bfs
    bfs_ans[V]=1;
    bfs_visited[V] = true;
    bfs_count = 2;
    bfs(V);
    StringBuilder bfs_sb=new StringBuilder();
    for(int i=1;i<=N;i++){
      for(int j=1;j<=N;j++){
        if (bfs_ans[j]==i){
          bfs_sb.append(j).append(' ');
          break;
        }
      }
    }
    System.out.println(bfs_sb);
  }
}