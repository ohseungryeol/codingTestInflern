package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class meetingTime {
    static class meet implements Comparable<meet>{
        int start;
        int end;

        public meet(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(meet o) {
            if(this.end==o.end){
                return this.start - o.start;
            }

            return this.end-o.end;
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("안녕");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<meet> m = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            m.add(new meet(s, e));
        }

        Collections.sort(m);
        int answer =0;
        int tmpEnd = 0;
        int tmpStart =0;


        for (int i=0; i<m.size(); i++){
            if( m.get(i).start>=tmpEnd){
                tmpStart = m.get(i).start;
                tmpEnd = m.get(i).end;
                answer ++;
            }
        }


    }
}
