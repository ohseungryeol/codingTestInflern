package inflern;

import java.util.Arrays;
import java.util.Scanner;

public class GraphDFS {
    static int[][] graph;
    static int[] check;
    static int count=0;
    static int N,M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt(); //정점 수
         M = sc.nextInt(); //간선 수

        graph = new int[N+1][N+1];
        for (int i=1; i<=M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b]=1;
        }
        check = new int[N + 1];
        check[1]=1;
        DFS(1);

    }

    public static void DFS(int n){
        if (n==5){
            count++;
        }
        else{
            for (int i=1; i<=N; i++){
                if(graph[n][i]==1 && check[i]==0){
                    check[i]=1;
                    DFS(i);
                    check[i]=0;
                }
            }
        }
    }
}
