package inflern;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str= str.toUpperCase();
        str= str.replaceAll("[^A-Z]", ""); // 문자열이 A~Z까지의 문자가 아니면 빈문자로 치환


        char[] ch = str.toCharArray();
        int left=0, right=ch.length-1;

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
}
