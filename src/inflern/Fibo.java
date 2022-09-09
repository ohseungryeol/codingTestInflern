package inflern;

import java.util.Scanner;

public class Fibo {
    static int[] fibo;
    public static int Fi(int n){
        if(fibo[n]>0) return fibo[n]; //메모이제이션
        if(n==1) return fibo[n]=1;
        if(n==2) return fibo[n]=1;

        return fibo[n]= Fi(n - 2) + Fi(n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        fibo = new int[n + 1];
        Fi(n);
        for (int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
}
