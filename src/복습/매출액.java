package 복습;

import java.util.Scanner;
import java.util.*;
import java.io.*;
public class 매출액 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //총 일 수
        int K = sc.nextInt(); //연속된 k일동안의 매출액의 종류
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<K; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt =0;
        int rt =K;
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(map.size());

        while(rt<arr.length){
            map.put(arr[lt],map.getOrDefault(arr[lt],0)-1);
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if(map.get(arr[lt])<=0){
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
