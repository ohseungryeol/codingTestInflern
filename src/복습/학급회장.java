package 복습;
import java.util.*;
import java.io.*;
public class 학급회장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String tmp = sc.next();
        int[] alpha = new int[26];

        for (char c:tmp.toCharArray()){
            alpha[c-'A']++;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex =0;
        for (int i=0; i<26; i++){
            if(alpha[i]>max){
                max = alpha[i];
                maxIndex =i;
            }
        }

        System.out.println((char)(maxIndex+65));
    }
}
