package inflern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Section3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //A집합의 크기
        int[] A = new int[N];
        for (int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int M= sc.nextInt(); //B집합의 크기
        int[] B = new int[M];
        for (int i=0; i<M; i++){
            B[i] = sc.nextInt();
        }


        for (int x: solution(N,M,A,B)){
            System.out.print(x+" ");
        }

    }

    public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        int p1=0, p2=0;
        while(p1<N && p2<M){
            if(A[p1]<B[p2]){
                p1++;
            } else if (A[p1]==B[p2]){
                answer.add(A[p1]);
                p1++;
                p2++;
            } else{
                p2++;
            }
        }

        return answer;

    }
}
