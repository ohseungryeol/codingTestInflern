package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM {
    static int N,M;
    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        check = new int[N + 1];
        int[] arr = new int[M];
        DFS(0,arr);

    }

    public static void DFS(int L,int[] arr){
        if (L==M){
            for (int i=0; i<M; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        } else{
            for (int i=1; i<=N; i++){
                if (check[i]==0) {
                    arr[L] = i;
                    check[i]=1;
                    DFS(L + 1, arr);
                    check[i]=0;
                }
            }
        }
    }
}
