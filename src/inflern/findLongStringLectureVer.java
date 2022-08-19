package inflern;

import java.util.Scanner;

public class findLongStringLectureVer {

    public static String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE; // int중 가장 작은 값을 넣어주는 함수
        int long_index = 0;
        int pos;
        while((pos=str.indexOf(' '))!=-1){ //pos는 띄어쓰기가 나오는 index 번호-> 띄어쓰기가 없다면 계속 while문을 돈다
            String tmp = str.substring(0,pos); //tmp에 띄어쓰기 전까지 문자열 저장
            if (tmp.length()>m) {
                m = tmp.length();
                answer = tmp;
            }

            str = str.substring(pos+1); //띄어쓰기 다음부터 끝까지 문자열 저장
        }

        if (m<str.length()){
            answer = str;
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
