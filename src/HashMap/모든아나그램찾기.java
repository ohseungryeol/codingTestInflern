package HashMap;
import java.util.*;
public class 모든아나그램찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //긴문자열
        String b= sc.next(); //짧은 문자열

        HashMap<Character,Integer> aMap = new HashMap<>();
        HashMap<Character,Integer> bMap = new HashMap<>();
        for(char x:b.toCharArray()){
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }
        int lt =0;
        int answer=0;

        for(int i=0; i<b.length()-1; i++){
            char x=a.charAt(i);
            aMap.put(x, aMap.getOrDefault(x, 0) + 1);
        }

        for (int rt=b.length()-1; rt<a.length(); rt++){
            aMap.put(a.charAt(rt), aMap.getOrDefault(a.charAt(rt), 0)+1);
            if(aMap.equals(bMap)) answer++;
            aMap.put(a.charAt(lt),aMap.get(a.charAt(lt))-1);
            if(aMap.get(a.charAt(lt))==0) aMap.remove(a.charAt(lt));
            lt++;
        }
        System.out.println(answer);

    }

}
