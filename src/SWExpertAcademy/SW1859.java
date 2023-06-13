package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i=1; i<=T; i++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            int max =-1;
            st = new StringTokenizer(br.readLine());
            boolean flag = false;

            for (int j=0; j<N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int pivot = arr[0];
            int maxIdx =0;
            int idx=0;
            for (int k=1; k<N; k++){
                if(pivot<arr[k]){
                    flag = true; // 내림차순 판별
                }
                if(max<arr[k]){
                    max = arr[k];
                    maxIdx =k;
                }
            }
            if(flag==false){
                System.out.printf("#%d %d\n",i,0);
                return;
            } else {
                int price =0;
                int cnt=0;
                int maxPrice =0;
                for (int m=0; m<maxIdx; m++){
                    price+=arr[m];
                }
                maxPrice=(max*cnt)-price;

            }

        }
    }
}
