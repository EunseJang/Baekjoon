package Bronze;

import java.io.*;

class B10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

    int []count = new int[10001];
		int N = Integer.parseInt(br.readLine());

		for(int i=0; i<N; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}

		for(int i=1; i<10001; i++) {
			while(count[i] > 0) {
				sb.append(i).append('\n');
				count[i]--;
			}
		}
		System.out.println(sb);
	}

  /* counting sort 직접 구현

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int N=Integer.parseInt(br.readLine());
    int [] arr = new int[N];

    for (int i=0;i<N;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }

    int max = Arrays.stream(arr).max().getAsInt();
    int [] count = new int[max+1];

    for(int i=0;i<N;i++){
      count[arr[i]] += 1;
    }

    for (int i=1; i<max+1;i++){
      count[i] += count[i-1];
    }

    int [] result = new int[N];
    for (int i=N-1; i>=0;i--){
      result[--count[arr[i]]] = arr[i];
    }

    for (int i=0;i<N;i++){
      bw.write(Integer.toString(result[i])+'\n');
    }
    bw.flush();
    bw.close();

   */
}