package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class SumoWrestler {

    static class Physical implements Comparable<Physical> {
        int height;
        int weight;

        public Physical(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Physical o) {
            return o.height-this.height;
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Physical> man = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            man.add(new Physical(h, w));
        }
        int count = 0;
        Collections.sort(man);

        int max = Integer.MIN_VALUE;
        int answer =0;
        for (int i=0; i<man.size(); i++){
            if(man.get(i).weight>max){
                max = man.get(i).weight;
                answer++;
            }
        }

        System.out.println(answer);


    }
}
