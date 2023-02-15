package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

class B18258 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    Deque<Integer> queue= new LinkedList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0){
      st= new StringTokenizer(br.readLine(), " ");

      switch(st.nextToken()){
      case "push":
        queue.addLast(Integer.parseInt(st.nextToken()));
        break;
      case "pop":
        if(queue.isEmpty()){
          sb.append(-1).append('\n');
        }
        else{
          sb.append(queue.pollFirst()).append('\n');
        }
        break;
      case "size":
        sb.append(queue.size()).append('\n');
        break;
      case "empty":
        if (queue.isEmpty()){
          sb.append(1).append('\n');
        }
        else{
          sb.append(0).append('\n');
        }
        break;
      case "front":
        if(queue.isEmpty()){
          sb.append(-1).append("\n");
        }
        else{
          sb.append(queue.peekFirst()).append('\n');
        }
        break;
      case "back":
        if(queue.isEmpty()){
          sb.append(-1).append('\n');
        }
        else{
          sb.append(queue.peekLast()).append('\n');
        }
        break;
      }
    }
    System.out.print(sb);
  }
}
