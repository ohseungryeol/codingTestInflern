package inflern;

import java.util.Scanner;

public class Section2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                int left = j-1;
                int right = j+1;
                int up = i-1;
                int down = i+1;

                if (arr[i][j]>arr[i][left] && arr[i][j]>arr[i][right] && arr[i][j]>arr[up][j] && arr[i][j]>arr[down][j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
