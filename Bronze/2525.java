package Bronze;

import java.io.*;
import java.util.*;

class B2525 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A=Integer.parseInt(st.nextToken());
    int B=Integer.parseInt(st.nextToken());

    int CurrentM = A*60+B;

    st = new StringTokenizer(br.readLine());
    int C=Integer.parseInt(st.nextToken());

    int sumM = CurrentM + C;
    int hour = sumM/60;
    int minute = sumM%60;


    if(hour<24){
      bw.write(Integer.toString(hour));
      bw.write(' ');
      bw.write(Integer.toString(minute));
      bw.flush();
    }
    else{
      bw.write(Integer.toString(hour-24));
      bw.write(' ');
      bw.write(Integer.toString(minute));
      bw.flush();
    }
    bw.close();
  }
}
