package inflern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ReversePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int x: solution(n,arr)){
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<n; i++){
            int tmp = arr[i];
            int res=0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }

            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static boolean isPrime(int x){
        if (x==1) return false;
        for (int i=2; i<x; i++){
            if(x%i ==0){
                return false;
            }
        }
        return true;
    }
}
