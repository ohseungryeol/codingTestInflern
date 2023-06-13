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
            map.put(x, map.getOrDefault(x,0)+1); //
            //getOrDefault는 해시테이블 키값을 탐색 후 탐색한 값이 있으면 그 value를 리턴하고 없으면 0을 리턴한다.
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
