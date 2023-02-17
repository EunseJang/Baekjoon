package Silver;

import java.util.*;

class S1269 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int A=scanner.nextInt();
    int B=scanner.nextInt();

    HashSet<Integer> setA = new HashSet();
    HashSet<Integer> setB = new HashSet(); 
    HashSet<Integer> temp1 = new HashSet();
    HashSet<Integer> temp2 = new HashSet();

    for(int i=0;i<A;i++){
      int num=scanner.nextInt();
      setA.add(num);
      temp1.add(num);
    }
    for(int i=0;i<B;i++){
      int num=scanner.nextInt();
      setB.add(num);
      temp2.add(num);
    }
    
    temp1.removeAll(setB);
    temp2.removeAll(setA);
    temp1.addAll(temp2);
    System.out.println(temp1.size());
  }
}