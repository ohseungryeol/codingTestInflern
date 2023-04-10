package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 매출액 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        ArrayList<Integer> answer = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<K; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        answer.add(map.size());
        int lt = 0;
        int rt = K;

        for (int i=K; i<arr.length; i++){
            map.put(arr[lt],map.getOrDefault(arr[lt],0)-1);
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            answer.add(map.size());
            lt++;
            rt++;
        }

        for (int i=0; i<answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }




    }
}
