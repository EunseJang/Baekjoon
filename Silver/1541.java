package Silver;

import java.io.*;
import java.util.*;

class S1541 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    ArrayList<Integer> num = new ArrayList<>();
    ArrayList<String> oper = new ArrayList<>(); 
    
    String str = br.readLine();
    st = new StringTokenizer(str, "+|-");
    while(st.hasMoreTokens()){
      num.add(Integer.parseInt(st.nextToken()));
    }

    oper.add(null);

    for (int i=0;i<str.length();i++){
      if(str.charAt(i)=='+'){
        oper.add("+");
      }
      else if(str.charAt(i)=='-'){
        oper.add("-");
      }
    }

    int sum = num.get(0);

    if (oper.contains("-")==false){
      IntSummaryStatistics temp = num.stream().mapToInt(Integer::intValue).summaryStatistics();
      int result = (int)(temp.getSum());
      bw.write(Integer.toString(result));
      bw.flush();
      bw.close();
    }
    else{
      for (int i=1;i<num.size();i++){
        if(oper.get(i).equals("-")){
          for (int j=i;j<num.size();j++){
            sum -= num.get(j);
          }
          break;
        }
        sum += num.get(i);
      }
      bw.write(Integer.toString(sum));
      bw.flush();
      bw.close();
    }
  }
}
