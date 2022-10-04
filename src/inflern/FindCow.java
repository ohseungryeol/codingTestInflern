package inflern;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class FindCow {
    static int[] dis = {1, -1, 5};
    static int[] check = new int[10001];
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); //현수
        int cow = sc.nextInt();

        System.out.println(BFS(p,cow));
    }

    public static int BFS(int p, int cow){
        queue.offer(p);
        check[p]++;
        int Lv =0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for (int i=0; i<len; i++){
                int x = queue.poll();

                for (int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if (nx ==cow) return Lv+1;
                    if(check[nx]==0 && nx>=1 && nx<=10000){
                        check[nx]=1;
                        queue.offer(nx);
                    }
                }
            }
            Lv++;
        }
        return 0;
    }
}
