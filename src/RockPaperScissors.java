import java.util.Scanner;

public class RockPaperScissors {
    public static String winner(int n, int[] A, int[] B){
        String answer = "";

        for (int i=0; i<n; i++){
            if(A[i]==B[i]){
                answer += "D";
                continue;
            }
            if(A[i]==1){ //가위
                if(B[i]==2){
                    answer+="B";
                } else{
                    answer += "A";
                }
            } else if (A[i]==2){ //바위
                if(B[i]==1){
                    answer+="A";
                } else{
                    answer+="B";                }

            } else if (A[i]==3){ //보
                if(B[i]==1){
                    answer += "B";
                } else{
                    answer+="A";
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); // 게임 횟수
        int[] A = new int[n]; // A가 낸 수
        int[] B = new int[n]; // B가 낸 수

        for (int i=0; i<n; i++){
            A[i] =sc.nextInt();
        }
        for (int i=0; i<n; i++){
            B[i] =sc.nextInt();
        }

        char[]ch = winner(n,A,B).toCharArray();
        for(int i=0; i<ch.length; i++ ){
            System.out.println(ch[i]);
        }
    }
}
