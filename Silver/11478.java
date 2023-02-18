package Silver;

import java.io.*;
import java.util.*;

class S11478 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> set= new HashSet<>();

    String str=br.readLine();
    for(int i=0;i<str.length()+1;i++){
      for(int j=i+1;j<str.length()+1;j++){
        String s = str.substring(i, j);
        set.add(s);
      }
    }
    System.out.println(set.size());
  }
}
