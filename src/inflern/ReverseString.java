package inflern;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i=0; i<n; i++){
            strArr[i] = sc.next();
        }

        for(String x: strArr){
            char[] ch = x.toCharArray();
            int last = ch.length-1;
            for (int i=0; i<ch.length/2; i++){

                char tmp = ch[i];
                ch[i] = ch[last];
                ch[last]= tmp;
                last--;
            }
            System.out.println(ch);
        }


    }
}
