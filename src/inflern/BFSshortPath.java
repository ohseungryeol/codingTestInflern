package inflern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSshortPath {
    static int n,m,answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        distance = new int[n + 1];

        for (int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        BFS(1);

        for (int i=2; i<=n; i++){
            System.out.print(i+": "+distance[i]+" ");
        }
    }

    public static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        check[v]=1;
        distance[v]=0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for (int nv: graph.get(cv)){
                if(check[nv]==0){
                    check[nv]=1;
                    queue.offer(nv);
                    distance[nv] = distance[cv]+1;
                }
            }

        }
    }
}
