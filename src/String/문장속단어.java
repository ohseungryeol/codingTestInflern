package String;

import java.util.Scanner;

public class 문장속단어 {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        String answer ="";
        int maxLen =0;
        for(String tmp: arr){
            if(tmp.length()>maxLen){
                maxLen = tmp.length();
                answer = tmp;
            }
        }

        System.out.println(answer);
    }
}
