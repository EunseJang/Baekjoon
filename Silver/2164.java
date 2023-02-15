package Silver;

import java.util.*;

class S2164 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int N=scanner.nextInt();
    Deque<Integer> deque=new LinkedList<>();

    for(int i=1; i<=N;i++){
      deque.addLast(i);
    }
    for (int i=0;i<N-1;i++){
      deque.removeFirst();
      deque.addLast(deque.pollFirst());
    }
    System.out.println(deque.peekFirst());
  }
}
