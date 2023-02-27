package Bronze;

import java.io.*;
import java.util.*;

class B2798 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    int M=Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    int [] arr = new int[N];
    for(int i=0;i<N;i++){
      arr[i]=Integer.parseInt(st.nextToken());
    }

    ArrayList<Integer> sumArr = new ArrayList<>();

    for(int i=0;i<N;i++){
      for(int j=i+1;j<N;j++){
        for (int k=j+1;k<N;k++){
          int sum =arr[i]+arr[j]+arr[k];
          sumArr.add(sum);
        }
      }
    }

    Collections.sort(sumArr);

    if(sumArr.contains(M)){
      System.out.println(M);
    }
    else{
      if(sumArr.size()==1){
        System.out.println(sumArr.get(0));
      }
      else{
        int index=0;
        if(sumArr.get(sumArr.size()-1)>M){
          for(int i=0;i<sumArr.size();i++){
            if(M<sumArr.get(i)){
              index=sumArr.indexOf(sumArr.get(i));
              System.out.println(sumArr.get(index-1));
              System.exit(0);
            }
          }
        }
        else{
          System.out.println(sumArr.get(sumArr.size()-1));
        }
      }
    }
  }
}