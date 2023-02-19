package Silver;

import java.io.*;
import java.util.*;

class S2606 {
  static ArrayList<ArrayList<Integer>> graph;
  static boolean visited [];
  static int answer [];
  static int count;

  public static void bfs(int v){
    answer[v] = 1;
    visited[v] = true;
    count=2;

    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v);

    while(!queue.isEmpty()){
      int temp = queue.poll();
      
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
    StringTokenizer st;

    int node = Integer.parseInt(br.readLine());
    int edge = Integer.parseInt(br.readLine());

    graph=new ArrayList<>();
    answer = new int[node+1];
    visited = new boolean[node+1];

    for(int i=0;i<=node;i++){
      graph.add(new ArrayList<>());
    }

    for (int i=0;i<edge;i++){
      st=new StringTokenizer(br.readLine());
      int a=Integer.parseInt(st.nextToken());
      int b=Integer.parseInt(st.nextToken());
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    for(int i=0;i<=node;i++){
      Collections.sort(graph.get(i));
    }

    bfs(1);
    
    int result=0;
    for(int i=1;i<=node;i++){
      if(answer[i]!=0){
        result++;
      }
    }
    System.out.println(result-1);
  }
}
