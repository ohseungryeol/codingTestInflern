package inflern;

import java.util.Scanner;

public class Fibonacchi {
    public static void Fibo(int n){ //1 1 2 3 5 8 13
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;

        for (int i=2; i<n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //피보나치 항의 갯수
        Fibo(n);
    }
}
