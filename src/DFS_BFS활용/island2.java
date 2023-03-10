package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class island2 {//섬나라 아일랜드 (DFS)
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
    static int[] dy = {0, -1, 0, 1, -1, 1, -1, 1};
    static Queue<Point> queue = new LinkedList<>();
    static int answer =0;
    static int n;
    static class Point{
        int x,y;
        public Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
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
                    queue.offer(new Point(i, j));
                    BFS(i,j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static void BFS(int x, int y) {
        board[x][y] = 0;
        while (!queue.isEmpty()) {
            Point tmp= queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx > 0 && nx <= n && ny > 0 && ny <= n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }
}
