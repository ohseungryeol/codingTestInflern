package inflern;

import java.util.Arrays;
import java.util.Scanner;

public class findLongString {

    public static String solution(String str){

        String[] strArr = str.split(" "); //문자열 배열을 띄어쓰기 기준으로 자른다 .

        int longArr = strArr[0].length();
        int long_index = 0;
        for (int i=1; i<strArr.length; i++){
            if (longArr<strArr[i].length()) long_index = i;
        }

        return strArr[long_index];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

}
