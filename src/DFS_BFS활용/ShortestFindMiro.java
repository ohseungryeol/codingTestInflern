package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ShortestFindMiro {
    static int[][] miro = new int[8][8];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] dis = new int[8][8];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i=1; i<=7; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=7; j++){
                miro[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        BFS(1,1);
        if(dis[7][7]==0){
            System.out.println(-1);
        }

    }

    public static void BFS(int x, int y){

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x,y));
        miro[x][y]=1;
        while(!queue.isEmpty()){
            Node tmp = queue.poll();
            for (int i=0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if( nx>0 && nx<8 && ny>0 && ny<8 && miro[nx][ny]==0){
                    miro[nx][ny]=1;
                    queue.offer(new Node(nx,ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                    if(nx==7 && ny==7){
                        System.out.println(dis[nx][ny]);
                        return;
                    }
                }
            }
        }
    }

    public static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
}
