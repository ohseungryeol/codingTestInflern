package DFS_BFS활용;
import java.util.*;
public class 부분집합 {
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
    }

    public static void DFS(int L){
        if(L==n+1){
            for (int i=1; i<=L; i++){
                if(arr[i]==0) continue;
                System.out.print(arr[i]+" ");
            }
        } else{
            arr[L]=L;
            DFS(L + 1);
            arr[L]=0;
            DFS(L+1);
        }
    }
}
