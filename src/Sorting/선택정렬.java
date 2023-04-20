package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        } // 13 5 11 7 23 15

        //i는 0부터 j는 i+1부터 탐색하면서 arr[idx]보다 작은 원소중에 제일 작은 j값을 찾아서 스왑한다.
        for (int i=0; i<n-1; i++){
            int idx = i;
            for (int j=i+1; j<n; j++){
                if(arr[j]<arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
