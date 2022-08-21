package inflern;

import java.util.Scanner;

public class IsPalindrome {
    public static void solution(String str){
        char[] ch = str.toCharArray();
        int left =0, right = ch.length-1;

        while(left<right){
            if(ch[left]==ch[right]){
                left++;
                right--;

            } else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();

        solution(str);
    }
}
