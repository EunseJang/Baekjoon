package Silver;

import java.io.*;
import java.util.*;

class S24479 {
  static ArrayList<ArrayList<Integer>> graph;
  // 각 노드가 연결된 값을 저장할 graph
  static int [] answer; // 출력할 답
  static boolean [] visited; // 노드 방문 여부 체크
  static int count; // 방문한 노드 순서 체크

  public static void dfs(int v){
    for(int vertex: graph.get(v)){
      if(!visited[vertex]){
        answer[vertex]=count++; // 방문 순서 증가 시키기
        visited[vertex] = true;
        dfs(vertex);
      }
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken()); // 노드 수
    int M=Integer.parseInt(st.nextToken()); // 간선 수
    int K=Integer.parseInt(st.nextToken()); // 시작 정점

    graph=new ArrayList<>(); // 2중 ArrayList
    answer = new int[N+1]; // 노드 수 + 1 (index=0은 더미 값)
    visited = new boolean[N+1]; // 노드 수 + 1 (index=0은 더미 값)

    for(int i=0;i<=N;i++){
      graph.add(new ArrayList<>()); // 2중 ArrayList
    }

    for(int i=0;i<M;i++){ // 간선 수 만큼 진행
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    for (int i=1;i<=N;i++){
      Collections.sort(graph.get(i)); // 오름차순 정렬
    }

    // 시작 정점 셋팅
    answer[K]=1;
    visited[K]=true;
    count =2;
    dfs(K);

    // StringBuilder을 사용해 메모리 절약
    StringBuilder sb = new StringBuilder();
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
