import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    static Student[] student;
    static int answer = 0;
    static int N,M;
    static int time=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 문제 수
        M = Integer.parseInt(st.nextToken()); // 제한 시간
        student = new Student[N];
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            student[i] = new Student(score,time);
        }
        DFS(0,0,0);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum, int time){

       if(time >M) return;
       answer = Math.max(answer,sum);
       if(L==N){
           return;
       } else {
           DFS(L+1,sum+student[L].score,time+student[L].time); // 현재 문제를 푼다
           DFS(L+1,sum,time); //풀지 않는다
       }
    }

    static class Student{
        int score;
        int time;

        public Student(int score, int time){
            this.score = score;
            this. time = time;
        }
    }
}
