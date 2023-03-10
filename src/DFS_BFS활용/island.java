package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class island {//섬나라 아일랜드 (DFS)
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
    static int[] dy = {0, -1, 0, 1, -1, 1, -1, 1};
    static int answer =0;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        board = new int[n + 1][n + 1];

        for (int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if(board[i][j]==1){
                    DFS(i,j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static void DFS(int x, int y){

        for (int i=0; i<8; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if (nx>0 && nx<=n && ny>0 && ny<=n && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny);
            }
        }
    }
}
