package Silver;

import java.io.*;
import java.util.*;

class S1764 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int N=Integer.parseInt(st.nextToken());
    int M=Integer.parseInt(st.nextToken());

    HashSet<String> setN=new HashSet<>();
    HashSet<String> setM=new HashSet<>();

    for(int i=0;i<N;i++){
      st=new StringTokenizer(br.readLine());
      setN.add(st.nextToken());
    }
    for(int i=0;i<M;i++){
      st=new StringTokenizer(br.readLine());
      setM.add(st.nextToken());
    }

    setN.retainAll(setM);
    System.out.println(setN.size());
    
    String [] arr = setN.toArray(new String[0]);
    Arrays.sort(arr);
    for(int i=0;i<setN.size();i++){
      System.out.println(arr[i]);
    }
  }
}