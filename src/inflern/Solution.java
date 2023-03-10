package inflern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.StringTokenizer;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Point{
    public int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution
{
    static int[] dx ={-1,0,1,0};
    static int[] dy ={0,1,0,-1};
    static int r,c;
    static int count;
    static int[] check ;
    static boolean flag;

    public static void main(String args[]) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());


		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            st = new StringTokenizer(br.readLine()); //행 열 입력
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            char[][] city = new char[r][c];
            for (int i=0; i<r; i++){
                String str = br.readLine(); // 알파벳 입력
                for (int j=0; j<c; j++){
                    city[i][j] = str.charAt(j);
                }
            }
            count=1;
            check = new int[26];
            flag = false;
            System.out.print("#"+test_case+" ");
            DFS(city,0,0);
            System.out.println(count);

        }

    }


    public static void DFS(char[][] city, int x, int y){
        Point start = new Point(x,y);
        check[city[x][y]-'A']=1;

        for (int i=0; i<4; i++){
            int nx = start.x+dx[i];
            int ny = start.y+dy[i];
            if (nx>=0 && nx<r && ny>=0 && ny<c && check[city[nx][ny]-'A']==0){
                count++;
                DFS(city,nx,ny);
            } else{
                return;
            }

        }


    }
}
