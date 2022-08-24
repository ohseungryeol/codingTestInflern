package inflern;

import java.util.Scanner;

public class StringPackage {
    public static String solution(String str){
        String answer ="";
        char[] ch = str.toCharArray();
        int count =1;

        for (int i=0; i<ch.length-1; i++){
            if (ch[i]==ch[i+1]){
                count ++;
                if(i==ch.length-2){
                    answer+=ch[i];
                    answer+=Integer.toString(count);
                }
                continue;
            } else{
                answer+=ch[i];
                if (count>=2){
                    String strNum = Integer.toString(count);
                    answer+=strNum;
                }
                count =1;
                if(i==ch.length-2) answer+=ch[i+1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
