package inflern;

import java.util.Scanner;

public class CharacterShortDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0); //문자 1개입력

        char[] ch = str.toCharArray();
        int[] answer = new int[ch.length];
        int distance = 1000;

        for (int i=0; i<ch.length; i++){
            if (ch[i]==target){
                distance = 0;
            } else{
                distance++;
            }
            answer[i]= distance;
        }

        for (int i=answer.length-1; i>=0; i--){
            if(ch[i]==target){
                distance =0;
            } else{
                distance++;
                if (answer[i]<distance) distance = answer[i];
            }
            answer[i] = distance;
        }

        for (int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }




    }
}
