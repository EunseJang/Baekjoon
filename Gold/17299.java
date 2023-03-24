package Gold;

import java.io.*;
import java.util.*;

class G17299 {
  public static void main (String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N=Integer.parseInt(br.readLine());
    int []num = new int[N];
    int []result = new int[N];
    int []count = new int[1000001];

    st = new StringTokenizer(br.readLine());
    for (int i=0;i<N;i++){
      num[i] = Integer.parseInt(st.nextToken());
      count[num[i]]++;
    }
    
    Stack<Integer> stack = new Stack<>();

    for(int i=0;i<N;i++){
      while(!stack.isEmpty() && count[num[stack.peek()]]<count[num[i]]){
        result[stack.pop()] = num[i];
      }
      stack.push(i);
    }

    while(!stack.isEmpty()){
      result[stack.pop()] = -1;
    }

    for(int i=0;i<N;i++){
      sb.append(result[i]).append(" ");
    }
    System.out.println(sb);
  }
}
