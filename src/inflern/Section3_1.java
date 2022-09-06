package inflern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Section3_1 { //투포인터 알고리즘
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++) arr1[i] = sc.nextInt();

        int m =sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++) arr2[i] = sc.nextInt();

        for (int x: solution(n,m,arr1,arr2)){
            System.out.print(x+" ");
        }

    }

    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 =0, p2=0;
        while (p1<n && p2<m){
            if(arr1[p1]<arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
            } else{
                answer.add(arr2[p2]);
                p2++;
            }
        }

        if(p1<n) for (int i=p1; i<n; i++) answer.add(arr1[i]);
        if(p2<m) for (int i = p2; i < m; i++) answer.add(arr2[i]);
        return answer;
    }
}
