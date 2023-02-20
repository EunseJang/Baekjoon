package Bronze;

import java.io.*;

class B25501 {
  static int count = 1;
  public static int recursion(String str, int l, int r){
    if (l>=r) {
      return 1;
    }
    else if (str.charAt(l) != str.charAt(r)) {
      count ++;
      return 0;
    }
    else {
      count ++;
      return recursion(str, l+1,r-1);
    }
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    for(int i=0;i<T;i++){
      count =0;
      String str = br.readLine();
      int result =recursion(str, 0, str.length()-1);
      if(result == 1){
        System.out.println(result+ " " + (count+1));
      }
      else{
        System.out.println(result+ " " + (count));
      }
    }
  }
}