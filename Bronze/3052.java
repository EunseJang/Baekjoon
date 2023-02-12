package Bronze;

import java.util.*;

class B3052 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int [] num = new int[10];
    String [] temp = new String[10];
    for(int i=0;i<10;i++){
      num[i]=scanner.nextInt();
      num[i]=num[i]%42;
      temp[i]=Integer.toString(num[i]);
    }

    int count =0;
    for (int i=0;i<42;i++){
      if (Collections.frequency(Arrays.asList(temp),Integer.toString(i))!=0){
        count ++;
      }
    }

    System.out.println(count);
  }
}
