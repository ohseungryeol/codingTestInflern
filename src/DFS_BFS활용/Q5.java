package DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q5 {
    static Integer[] coin;
    static int N,M;
    static int answer=501;
    public static void main(String[] args) throws IOException { //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine()); //동전 갯 수
        coin = new Integer[N];
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++){
            coin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coin, Comparator.reverseOrder());
        M = Integer.parseInt(br.readLine()); //줘야할 돈
        DFS(0,0);
        System.out.println(answer);
    }

    public static void DFS(int count, int sum){
        if (sum>M) return;
        if(count>=answer) return;
         if (sum==M){
            answer = Math.min(answer,count);
            return;
        } else{
            for (int i=0; i<N; i++){
                DFS(count+1,sum+coin[i]);
            }
        }
    }


}
