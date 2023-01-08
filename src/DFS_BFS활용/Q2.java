package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    static int[] arr;
    static int C,N; // 최대 무게
    static int total;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum=0;
        DFS(0,0);
        System.out.println(total);
    }

    public static void DFS(int L, int sum){
        if (sum>C) return;

        if(L==N){
            if (sum>total) total = sum;
            return;
        }else{
            DFS(L+1,sum+arr[L]);
            DFS(L + 1, sum);
        }


    }
}
