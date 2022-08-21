package inflern;

import java.util.Scanner;

public class printNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.replaceAll("[^0-9]",""); // 문자열에서 0~9 숫자가 아니면 공백으로 치환

        int num = Integer.parseInt(str);

        System.out.println(num);
    }
}
