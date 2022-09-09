package inflern;

import java.util.Scanner;

public class binaryRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Recut(n);
    }

    public static void Recut(int n){
        int m = n%2;
        if (n==0){
            return;
        }
        Recut(n / 2);
        System.out.println(m);

    }
}
