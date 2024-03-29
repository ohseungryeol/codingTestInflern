package DynamicProgramming;

import java.util.Scanner;

public class StairClimb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[36];

        dp[0]=0;
        dp[1]=1;
        dp[2]=2;

        for (int i=3; i<=35; i++){
            dp[i]=dp[i-2]+dp[i-1];
        }

        System.out.println(dp[N]);
    }
}
