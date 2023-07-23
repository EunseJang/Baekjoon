package Bronze;

import java.io.*;
import java.util.*;

class B1145 {
  public static int gcd(int a, int b){
    while (b!=0) {
      int temp = b;
      b = a%b;
      a = temp;
    }
    return a;
  }

  public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int threeLcm(int a, int b, int c) {
        return lcm(a, lcm(b, c));
    }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st ;

    st = new StringTokenizer(br.readLine());
    int num [] = new int[5];

    for (int i=0; i<5; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }

    int result[] = new int[10];

    result[0] = threeLcm(num[0], num[1], num[2]);
    result[1] = threeLcm(num[0], num[1], num[3]);
    result[2] = threeLcm(num[0], num[1], num[4]);
    result[3] = threeLcm(num[0], num[2], num[3]);
    result[4] = threeLcm(num[0], num[2], num[4]);
    result[5] = threeLcm(num[0], num[3], num[4]);
    result[6] = threeLcm(num[1], num[2], num[3]);
    result[7] = threeLcm(num[1], num[2], num[4]);
    result[8] = threeLcm(num[1], num[3], num[4]);
    result[9] = threeLcm(num[2], num[3], num[4]);

    int answer = Arrays.stream(result).min().getAsInt();
    System.out.println(answer);
  }  
}
