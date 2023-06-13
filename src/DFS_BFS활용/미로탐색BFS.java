package DFS_BFS활용;

import java.util.*;

public class 미로탐색BFS {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int answer=0;

    static class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[7][7];

        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                board[i][j]=sc.nextInt();
            }
        }

        BFS(0,0,board);
        if(board[6][6]==0){
            System.out.println(-1);
        } else{
            System.out.println(board[6][6]);
        }
    }

    public static void BFS(int x, int y, int[][] board){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        while(!queue.isEmpty()){
            Point tmp = queue.poll();

            for (int i=0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && board[nx][ny]==0){
                    board[nx][ny]=board[tmp.x][tmp.y]+1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }
}
