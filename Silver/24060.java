package Silver;

import java.io.*;
import java.util.*;

class S24060 {
  public static int K;
  public static int count = 0;
  public static int result = 0;
  public static void merge_sort(int [] temp, int []arr, int p, int r){
    if (p<r){
      int q = (p+r)/2;
      merge_sort(temp, arr, p, q);
      merge_sort(temp, arr, q+1, r);
      merge(temp, arr, p, q, r);
    }
  }

  public static void merge(int temp[], int[] arr, int p, int q, int r){
    int i= p;
    int j= q+1;
    int t= 0;

    while(i<=q && j<=r){
      if(arr[i]<=arr[j]){
        temp[t++] = arr[i++];
      }
      else{
        temp[t++] = arr[j++];
      }
    }
    
    while(i<=q){
      temp[t++] = arr[i++];
    }
    while(j<=r){
      temp[t++] = arr[j++];
    }
    i=p;
    t=0;
    while(i<=r){
      int result = temp[t++];
      arr[i++] = result;
      count++;

      if(count == K){
        System.out.println(result);
        System.exit(0);
      }
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N=Integer.parseInt(st.nextToken());
    K=Integer.parseInt(st.nextToken());
    int [] A = new int [N];
    int [] temp = new int[N];

    st=new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      int num=Integer.parseInt(st.nextToken());
      A[i] = num;
    }

    merge_sort(temp, A, 0, N-1);

    if(count !=K){
      System.out.println(-1);
    }
  }
}