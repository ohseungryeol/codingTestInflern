package DFS_BFS활용;

import java.util.Scanner;

public class Q7 { //메모이제이션을 이용해 조합 수 구하기 nCr
    static int[][] dy = new int[35][35];
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int r = sc.nextInt();

        System.out.println(DFS(n,r));
    }

    public static int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(r==0 || n==r){
            return 1;
        } else {
            return dy[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
        }
    }
}
