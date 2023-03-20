package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class weddingCeremony {
    static class timeState implements Comparable<timeState>{
        int time;
        char state;

        public timeState(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(timeState o) {
            if(this.time==o.time){
                return this.state-o.state;
            }
            return this.time-o.time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayList<timeState> arr = new ArrayList<>();
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr.add(new timeState(s, 's'));
            arr.add(new timeState(e, 'e'));
        }
        Collections.sort(arr);

        int cnt = 0;
        int answer =0;
        for (int i=0; i<arr.size(); i++){
            if(arr.get(i).state=='s'){
                cnt ++;
            } else{
                cnt --;
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}
