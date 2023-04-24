package String;

import java.util.Scanner;

public class 문자찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(findAlpha(tmp,c));
    }

    public static int findAlpha(String str, char c ){
        int answer =0;
        str = str.toUpperCase();
        c=Character.toUpperCase(c);
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                answer++;
            }
        }

        return answer;
    }
}
