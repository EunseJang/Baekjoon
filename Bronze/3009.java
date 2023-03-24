package Bronze;

import java.io.*;
import java.util.*;

class B3009 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    List<Integer> X = new ArrayList<>(3);
    List<Integer> Y = new ArrayList<>(3);

    X.add(0,Integer.parseInt(st.nextToken()));
    Y.add(0,Integer.parseInt(st.nextToken()));

    st = new StringTokenizer(br.readLine());
    X.add(1,Integer.parseInt(st.nextToken()));
    Y.add(1,Integer.parseInt(st.nextToken()));

    st = new StringTokenizer(br.readLine());
    X.add(2,Integer.parseInt(st.nextToken()));
    Y.add(2,Integer.parseInt(st.nextToken()));

    int resultX=0;
    int resultY=0;

    for(int i=0;i<3;i++){
      int cntX = Collections.frequency(X, X.get(i));
      if(cntX !=2 ){
        resultX=X.get(i);
      }
    }
    for(int i=0;i<3;i++){
      int cntY = Collections.frequency(Y, Y.get(i));
      if(cntY !=2 ){
        resultY=Y.get(i);
      }
    }
    bw.write(Integer.toString(resultX));
    bw.write(" ");
    bw.write(Integer.toString(resultY));
    bw.flush();
    bw.close();
  }
}
