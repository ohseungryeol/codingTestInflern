package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 아나그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map1 = new HashMap<>();

        String tmp1 = br.readLine();

        for(char x:tmp1.toCharArray()){
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        String tmp2 = br.readLine();
        System.out.println(isAnagram(tmp2,map1));



    }

    public static String isAnagram(String s, HashMap<Character, Integer> map){
        for(char x:s.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0){
                return "No";
            }
            map.put(x,map.get(x)-1);
        }

        return "YES";
    }
}
