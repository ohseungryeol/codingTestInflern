package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        String tmp = sc.next();

        for (char x:tmp.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1); // key값이 처음 들어오면 0
        }
        int max = Integer.MIN_VALUE;
        char answer = ' ';
        char[] arr = {'A','B','C','D','E'};

        for (char x: arr){
            if(map.get(x)>max){
                max = map.get(x);
                answer =x;
            }
        }

        System.out.println(answer);

    }
}
