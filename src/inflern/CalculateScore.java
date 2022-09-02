package inflern;

import java.util.Scanner;

public class CalculateScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum=0;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            if(i==n-1){
                sum+=arr[i];
                break;
            }

            if(arr[i]!=0 && arr[i+1]!=0){
                arr[i + 1] = arr[i] + arr[i + 1];
                sum += arr[i];
            } else{
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
