package Bronze;

import java.util.*;

class B2920 {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    String str=scanner.nextLine();

    if(str.equals("1 2 3 4 5 6 7 8")==true){
      System.out.println("ascending");
    }
    else if(str.equals("8 7 6 5 4 3 2 1")==true){
      System.out.println("descending");
    }
    else{
      System.out.println("mixed");
    }
  }
}
