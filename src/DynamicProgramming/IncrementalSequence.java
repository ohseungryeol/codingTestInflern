package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IncrementalSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer =0;
        int[] arr = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            int n = Integer.parseInt(st.nextToken());
            arr[i]=n;
        }
        dp[0]=1;

        for (int i=1; i<N; i++){
            int val = arr[i];
            int max =0;
            boolean flag = false;
            for (int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    flag = true;
                    int dpVal = dp[j]+1;
                    max = Math.max(max, dpVal);
                }
            }
            if(flag==false){
                dp[i]=1;
            } else{
                dp[i]=max;
            }
            answer = Math.max(answer, dp[i]);

        }
       // System.out.println(Arrays.toString(dp));
        System.out.println(answer);
    }
}
