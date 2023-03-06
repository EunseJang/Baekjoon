package Silver;

import java.io.*;
import java.util.*;

class S1874 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    Stack<Integer> stack = new Stack<>();
    int n=Integer.parseInt(br.readLine());

    int temp = 0;
    for (int i=0;i<n;i++){
      int input = Integer.parseInt(br.readLine());

      if(temp < input){
        for(int j=temp+1;j<=input;j++){
          stack.push(j);
          sb.append('+').append('\n');
        }
        temp = input;
      }
      else{
        if (stack.peek() != input){
          bw.write("NO");
          bw.flush();
          bw.close();
          System.exit(0);
        }
      }
      stack.pop();
      sb.append('-').append('\n');
    }
    bw.write(String.valueOf(sb));
    bw.flush();
    bw.close();
  }
}
