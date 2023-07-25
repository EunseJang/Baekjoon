package Bronze;

import java.io.*;
import java.util.*;

class B1526 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String num = scanner.nextLine();
    int size = num.length();

    String start = "4";
    String end = "7";

    for (int i=0; i<size-1; i++){
      start = start.concat("4");
      end = end.concat("7");
    }

    List<Integer> numList = new ArrayList();

    for (int i = Integer.parseInt(start); i <= Integer.parseInt(end); i++) {
      String check = Integer.toString(i);
      boolean isOnly47 = true;
      for (char digit : check.toCharArray()) {
        if (digit != '4' && digit != '7') {
          isOnly47 = false;
          break;
        }
      }
      if (isOnly47) {
        numList.add(i);
      }
    }

    if(Integer.parseInt(num) < Integer.parseInt(start)){
      System.out.println("7".repeat(size - 1));
    }
    else {
      if(numList.contains(Integer.parseInt(num))){
        System.out.println(Integer.parseInt(num));
      }
      else{
        numList.add(Integer.parseInt(num));
        Collections.sort(numList);
        int check2= numList.indexOf(Integer.parseInt(num));
        System.out.println(numList.get(check2-1));
      }
    }
  }
}
