package Bronze;
import java.io.*;
import java.util.*;

class B2884 {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    if (H == 0){
      if (M < 45){
        H = 23;
        M = M + 60 - 45;
      }
      else if (M > 45) {
        M = M-45;
      }
      else {
        M = M-45;
      }
    }
    else {
      if (M < 45){
        H = H-1;
        M = M + 60 - 45;
      }
      else if (M > 45) {
        M = M-45;
      }
      else {
        M = M-45;
      }
    }

    System.out.println(H + " " + M);
  }
}
