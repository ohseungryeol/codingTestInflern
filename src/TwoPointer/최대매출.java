package TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 최대매출 { //sliding window
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sum = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<K; i++){
            sum+=arr[i];
        }
        int answer = sum;
        for (int i=K; i<arr.length; i++){
            sum=sum+arr[i]-arr[i-K];
           // System.out.println("sum-"+sum);
            answer = Math.max(answer,sum);
        }

        System.out.println(answer);


    }
}
