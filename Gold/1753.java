package Gold;

import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  int link;
  int weight;

  public Node(int link, int weight){
    this.link = link;
    this.weight = weight;
  }
  
  @Override
  public int compareTo(Node n){
    return weight - n.weight;
  }
}

class G1753 {
  private static final int INF = Integer.MAX_VALUE;
  static List<Node>[] list;
  static int [] distance;
  private static int v;
  private static int e;
  private static int k;

  public static void dijkstra(int vertex){
    PriorityQueue<Node> pq = new PriorityQueue<>();
    boolean visited [] = new boolean[v+1];
    pq.add(new Node(vertex, 0));
    distance[vertex]=0;

    while(!pq.isEmpty()){
      Node tempNode = pq.poll();
      int temp = tempNode.link;

      if(visited[temp]== true) continue;
      visited[temp]=true;

      for(Node n: list [temp]){
        if(distance[n.link]> distance[temp]+ n.weight){
          distance[n.link]=distance[temp]+n.weight;
          pq.add(new Node(n.link, distance[n.link]));
        }
      }
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    v=Integer.parseInt(st.nextToken());
    e=Integer.parseInt(st.nextToken());
    k=Integer.parseInt(br.readLine());
    list = new ArrayList[v+1];
    distance = new int [v+1];

    Arrays.fill(distance, INF);

    for(int i=1; i<=v;i++){
      list[i]=new ArrayList<>();
    }

    for(int i=0;i<e;i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());
      list[start].add(new Node(end, weight));
    }

    StringBuilder sb = new StringBuilder();
    dijkstra(k);

    for(int i=1;i<=v;i++){
      if(distance[i] == INF) sb.append("INF\n");
      else sb.append(distance[i]+"\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}