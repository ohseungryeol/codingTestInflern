package String;

import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String str = sc.next();
        //a ->97 A ->65  총 26개
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>=65 && c<=90){
                c = (char)(c+32);
            } else{
                c = (char)(c-32);
            }
            answer+=c;
        }

        System.out.println(answer);
    }
}
