package inflern;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphDFSArrayListVer {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    static int n;
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점 수
        int m = sc.nextInt(); //간선 수
        graph = new ArrayList<ArrayList<Integer>>();
        check = new int[n + 1];
        count =0;

        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        check[1]=1;
        for (int i=0; i<m; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            graph.get(a).add(b);
        }
        DFS(1);
        System.out.println(count);
    }

    public static void DFS(int v){
        if(v==n){ // 도착지에 도착하면 count증가
            count++;
        } else{
            for (int nv: graph.get(v)){ //v번 arrayList 원소들(정점 v에서 갈 수있는 정점 nv)
                if(check[nv]==0){
                    check[nv]=1;
                    DFS(nv);
                    check[nv]=0;
                }
            }
        }
    }
}
