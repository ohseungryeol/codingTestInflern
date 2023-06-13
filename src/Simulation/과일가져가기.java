package Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 과일가져가기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] fruit = new int[5][3];
        StringTokenizer st ;

        for (int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++){
                fruit[i][j] = Integer.parseInt(st.nextToken());
            }
            int min = Integer.MAX_VALUE;
            for (int k=0; k<3; k++){
                min = Math.min(min,fruit[i][k]+1);
            }
        }

        for (int i=0; i<5; i++){
            for (int j=i+1; j<3; j++){

            }
        }
    }
}
