package inflern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Section2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] stu = new int[n][5];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0; i<n; i++){
            for (int j=0; j<5; j++){
                stu[i][j]= sc.nextInt();
            }
        }



        for (int i=0; i<n; i++){ //학생 번호
            int cnt= 0;
            for (int j=0; j<n; j++){ //학생 번호

                for (int k=0; k<5; k++){ //1~5반
                    if (stu[i][j] == stu[j][k] && i != k) {
                            cnt++;
                            break;
                    }
                }

            }
            arr.add(cnt);
        }

        int max = arr.get(0);
        int answer=0;
        for (int i=0; i<arr.size(); i++){
            
            if(max<arr.get(i)){
                max = arr.get(i);
                answer = i+1;
            }
        }

        System.out.println(answer);
    }
}
