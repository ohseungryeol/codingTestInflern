package inflern;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchPath {
    static int N,M;
    static int[] check;
    static int answer;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) {
        //인접 리스트 연습
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        M= sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>(); //인접그래프에 정점 객체를 할당
        for (int i=0; i<=N; i++){
            graph.add(new ArrayList<Integer>()); // 인접그래프 내 정점에서 갈 수 있는 정점을 추가
        }


        for (int i=1; i<=M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); //a번이 갈 수 있는 b정점을 a 객체에 할당
        }
        check = new int[N + 1];
        check[1]=1;
        DFS(1);
    }
    public static void DFS(int v){
        if(v==5){
            answer++;
        } else{
            for (int nv: graph.get(v)){ //v번 정점이 갈 수 있는 next정점을 뽑아낸다.
                if (check[nv]==0) {
                    check[nv] = 1;
                    DFS(nv);
                    check[nv] = 0;
                }
            }
        }
    }
}
