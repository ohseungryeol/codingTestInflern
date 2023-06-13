package DFS_BFS활용;

import java.util.Scanner;

public class 미로탐색DFS {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int answer=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[7][7];

        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                board[i][j]=sc.nextInt();
            }
        }
        DFS(0,0,board);
        System.out.println(answer);
    }

    public static void DFS(int x, int y,int[][] board){
        board[x][y]=1;
        if (x==6 && y==6){
            answer++;
            return;
        }

        for (int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<7 && ny>=0 && ny<7 && board[nx][ny]==0){
                DFS(nx,ny,board);
                board[nx][ny]=0;
            }
        }
    }
}
