package inflern;

import java.util.Scanner;

public class PracDFS {
    static int n;
    static int[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=3;
        num = new int[n + 1];
        DFS(1);
    }

    public static void DFS(int L){
        if(L==n+1){
            for (int i=1; i<=n; i++){
                if (num[i]==1) System.out.print(i+" ");
            }
            System.out.println();
        } else{
            num[L] =1;
            DFS(L + 1);
            num[L]=0;
            DFS(L + 1);
        }
    }

}
