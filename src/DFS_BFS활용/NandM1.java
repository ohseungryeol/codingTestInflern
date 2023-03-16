package DFS_BFS활용;

import java.util.Scanner;

public class NandM1 {
    static int[] arr;
    static int[] check;
    static int N,M;
    public static void main(String[] args) { //1부터 N까지 자연수 중 중복없이 M개를 고른 수열
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] check = new int[N+1];
        arr = new int[M];
        DFS(0);
    }

    public static void DFS(int n){

        if (n==M){
            for (int i=0; i<M; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i=n; i<M; i++){
            for (int j=1; j<=n; j++){
                if(check[j]==0) {
                    check[j]=1;
                    arr[i] = j;
                    DFS(i + 1);
                    check[j]=0;
                }
            }
        }
    }
}
