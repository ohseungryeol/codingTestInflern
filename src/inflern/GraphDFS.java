package inflern;

import java.util.Arrays;
import java.util.Scanner;

public class GraphDFS {
    static int[][] graph;
    static int[] check;
    static int[] print;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점 수
        int m = sc.nextInt(); // 간선 수
        graph = new int[n + 1][n + 1];
        check = new int[n + 1];
        print = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        check[1]=1;
        DFS(1);

        System.out.println(count);

    }

    public static void DFS(int n){
        if (n==5){
            count++;
        } else {
            for (int i=1; i<=5; i++){
                if(graph[n][i]==1 && check[i]==0){
                    check[i]=1;
                    DFS(i);
                    check[i]=0;
                }
            }
        }
    }
}
