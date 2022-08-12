package inflern;

import java.util.Arrays;
import java.util.Scanner;

public class Prac2Upper {
    public static String solution(String str){
        char[] ch =str.toCharArray(); //문자열을 문자 배열로 변환

        for (int i=0; i<ch.length; i++){
            if(Character.isUpperCase(ch[i])==true){  //대문자가 true이면 소문자로변환
                ch[i]=Character.toLowerCase(ch[i]);
            } else{
                ch[i]=Character.toUpperCase(ch[i]); //대문자가 false이면 대문자로변환
            }
        }

        String answer = String.valueOf(ch); //문자배열을 문자열로 변환

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();

        System.out.println(solution(str));
    }
}
