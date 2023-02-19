package Silver;

import java.io.*;
import java.util.*;

class S24444 {
  static ArrayList<ArrayList<Integer>> graph;
  // 각 노드가 연결된 값을 저장할 graph
  static int [] answer; // 출력할 답
  static boolean [] visited; // 노드 방문 여부 체크
  static int count; // 방문한 노드 순서 체크

  public static void bfs(int v){
    answer[v] = 1;
    visited[v] = true;
    count = 2;

    Queue<Integer> queue = new LinkedList<>(); // queue 생성
    queue.offer(v);

    while(!queue.isEmpty()){
      int temp = queue.poll();
      
      for(int vertex: graph.get(temp)){
        if(!visited[vertex]){
          answer[vertex]= count++;
          visited[vertex] = true;
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

    graph = new ArrayList<>();
    answer = new int[N+1];
    visited = new boolean[N+1];

    for(int i=0;i<=N;i++){
      graph.add(new ArrayList<>());
    }

    for(int i=0;i<M;i++){
      st=new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    for(int i=0;i<=N;i++){
      Collections.sort(graph.get(i));
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