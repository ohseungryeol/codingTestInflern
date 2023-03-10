import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Djkstra {
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    class Edge implements Comparable<Edge>{
        public int vex;
        public int time;
        Edge(int vex, int time){
            this.vex = vex;
            this.time = time; //간선의 가중치
        }

        @Override
        public int compareTo(Edge ob) {
            return this.time-ob.time;
        }

    }

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= 20; //
        int m= 20; //간선 수
        graph = new ArrayList<ArrayList<Edge>>();
    }

    public void Djkstras(int v){
        PriorityQueue<Edge> pq = new PriorityQueue<>();

    }
}
