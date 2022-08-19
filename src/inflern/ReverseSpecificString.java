package inflern;

import java.util.Scanner;

public class ReverseSpecificString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] ch = str.toCharArray();
        int left = 0;
        int right=ch.length-1;

        while(left<right){
            if(!Character.isAlphabetic(ch[left])){ //알파벳이 아니면 left증가
                left++;
            } else if (!Character.isAlphabetic(ch[right])){ //알파벳이 아니면 right 감소
                right --;
            } else{
                char tmp= ch[left];
                ch[left]= ch[right];
                ch[right]= tmp;
                left++;
                right --;
            }
        }

        for (int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }

    }
}
