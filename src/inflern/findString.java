package inflern;

import java.util.Locale;
import java.util.Scanner;

public class findString {

    public int solution(String str, char t){
     int answer =0;
     return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();



        char str2= sc.next().charAt(0);  //문자 1개입력 함수

        str = str.toUpperCase(); //모든 문자열을 대문자로
        str2 = Character.toUpperCase(str2); // 문자를 대문자로
        char[] arr = str.toCharArray(); // 문자열을 배열화

        int count =0;
        for (int i=0; i<arr.length; i++){
            if (str.length()<=100 && arr[i]==str2){
                count++;
            }
        }

        System.out.println(count);

    }
}

