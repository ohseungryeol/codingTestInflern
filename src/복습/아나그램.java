package 복습;

import java.util.Arrays;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp1 = sc.next();
        String tmp2 = sc.next();

        char[] t1 = tmp1.toCharArray();
        char[] t2 = tmp2.toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);
        //System.out.println(Arrays.toString(t1));
        //System.out.println(Arrays.toString(t2));

        if(Arrays.equals(t1,t2)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
