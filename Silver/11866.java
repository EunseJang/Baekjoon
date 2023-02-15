package Silver;

import java.util.*;

class S11866 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int N=scanner.nextInt();
    int K=scanner.nextInt();

    ArrayList<Integer> arr = new ArrayList<>();
    int []result=new int[N];

    for(int i=1;i<=N;i++){
      arr.add(i);
    }

    int index=0;
    for(int i=0;i<N;i++){
      index=(index+K-1)%arr.size();
      result[i]=arr.get(index);
      arr.remove(index);
    }
    System.out.print("<");
    for(int i=0;i<N;i++){
      if(i==N-1){
         System.out.print(result[i]+">");
      }
      else{
        System.out.print(result[i]+", ");
      }
    }
  }
}
