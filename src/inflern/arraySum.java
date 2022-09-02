package inflern;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int sum1 =0;
        int sum2=0;
        int total_sum=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int last = arr.length-1;
        for(int i=0; i<n; i++){
            sum1+= arr[i][i]; // 좌측 대각선합
            sum2+= arr[i][last--]; //우측 대각선합
        }

        int diasum =0;
        if (sum1>sum2){
            diasum=sum1;
        } else{
            diasum= sum2;
        }

        int tot_sum = diasum;

        for (int i=0; i<n; i++){
            int sum_row=0;
            int sum_col=0;
            for (int j=0; j<n; j++){
                 sum_row+=arr[i][j];
                 sum_col+=arr[j][i];
            }
            if(sum_row > sum_col && sum_row>tot_sum){
                tot_sum = sum_row;
            } else if (sum_col>sum_row && sum_col >tot_sum){
                tot_sum = sum_col;
            }
        }









        System.out.println(tot_sum);


    }
}
