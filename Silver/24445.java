package Silver;

import java.io.*;
import java.util.*;

class S24445 {
  static ArrayList<ArrayList<Integer>> graph;
  static boolean visited [];
  static int answer [];
  static int count;

  public static void bfs(int v){
    visited[v]=true;
    answer[v]=1;
    count =2;

    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v);

    while(!queue.isEmpty()){
      int temp=queue.poll();
      
      for(int vertex: graph.get(temp)){
        if(!visited[vertex]){
          visited[vertex]=true;
          answer[vertex]=count++;
          queue.offer(vertex);
        }
      }
    }
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    int M=Integer.parseInt(st.nextToken());
    int K=Integer.parseInt(st.nextToken());

    graph=new ArrayList<>();
    visited = new boolean[N+1];
    answer = new int[N+1];

    for(int i=0;i<=N;i++){
      graph.add(new ArrayList<>());
    }

    for(int i=0;i<M;i++){
      st=new StringTokenizer(br.readLine());
      int a=Integer.parseInt(st.nextToken());
      int b=Integer.parseInt(st.nextToken());
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    for(int i=0;i<=N;i++){
      Collections.sort(graph.get(i), Collections.reverseOrder());
    }

    bfs(K);

    StringBuilder sb=new StringBuilder();
    for(int i=1;i<=N;i++){
      if(i==N){
        sb.append(answer[i]);
      }
      else{
        sb.append(answer[i]+"\n");
      }
    }
    System.out.println(sb);
  }
}
