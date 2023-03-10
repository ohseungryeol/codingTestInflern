package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10 {
    static int[][] square = new int[7][7];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] check= new int[7][7];
    static int count =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i=0; i<7; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<7; j++){
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        square[0][0]=1;
        DFS(0,0);
        System.out.println(count);

    }

    public static void DFS(int x, int y){

        if( x==6 && y==6){
            count++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && square[nx][ny] == 0) {
                    square[nx][ny] = 1;
                    DFS(nx, ny);
                    square[nx][ny] = 0;
                }
            }
        }
    }
}
