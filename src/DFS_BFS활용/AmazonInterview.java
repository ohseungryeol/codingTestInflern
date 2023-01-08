package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AmazonInterview {
    static int[] arr;
    static int N;
    static int total=0;
    static String str = "NO";
    static boolean flag = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            total+=arr[i];
        }

        int sum =0;

        DFS(0,sum);
        System.out.println(str);
    }

    public static void DFS(int L, int sum){
        if(flag ==true) return;
        if (total -sum ==sum){
            flag = true;
            str = "YES";
            return;
        }

        if (L==N){
            return;
        } else {
            DFS(L+1,sum+arr[L]);
            DFS(L+1, sum);
        }


    }
}
