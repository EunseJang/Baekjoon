package Bronze;

import java.io.*;
import java.util.*;

class B5073 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    while(true) {
      st = new StringTokenizer(br.readLine());
      List<Integer> arr = new ArrayList<>(3);

      arr.add(0, Integer.parseInt(st.nextToken()));
      arr.add(1, Integer.parseInt(st.nextToken()));
      arr.add(2, Integer.parseInt(st.nextToken()));

      if (arr.stream().mapToInt(Integer::intValue).sum()==0){
        break;
      }

      int max = Collections.max(arr);
      int maxIndex = arr.indexOf(max);
      int sum = 0;
      
      for(int i=0;i<3;i++){
        if(i!=maxIndex){
          sum += arr.get(i);
        }
      }

      if (max<sum){
        if(Collections.frequency(arr, arr.get(0))==1){
          if(Collections.frequency(arr, arr.get(1))==1){
            sb.append("Scalene").append('\n');
          }
          else{
            sb.append("Isosceles").append('\n');
          }
        }
        else if(Collections.frequency(arr,arr.get(0))==2){
          sb.append("Isosceles").append('\n');
        }
        else if(Collections.frequency(arr,arr.get(0))==3){
          sb.append("Equilateral").append('\n');
        }
      }  
      else{
        sb.append("Invalid").append('\n');
      }
    }
    System.out.print(sb);
  }
}
