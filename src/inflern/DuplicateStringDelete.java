package inflern;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateStringDelete {

    public static String solution(String str){
       String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(i ==str.indexOf(str.charAt(i))) answer+=str.charAt(i); //해당문자의 인덱스와 해당문자가 처음 나올때 인덱스가 같다면 중복문자가 아닌 것이다.
        }
         return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(solution(str));

    }
}
