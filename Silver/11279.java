package Silver;

import java.io.*;
import java.util.*;

class S11279 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st=new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

    for(int i=0;i<N;i++){
      st = new StringTokenizer(br.readLine());
      String str=st.nextToken();
      if (str.equals("0")){
        if(pq.isEmpty()){
          bw.write("0\n");
        }
        else{
          bw.write(String.valueOf(pq.poll())+'\n');
        }
      }
      else{
        pq.add(Integer.parseInt(str));
      }
      bw.flush();
    }
    bw.close();
  }
}