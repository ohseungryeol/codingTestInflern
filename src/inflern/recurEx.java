package inflern;

public class recurEx {
    public static void main(String[] args) {
        recur(3);
    }

    public static void recur(int n){
        if (n==0) return;

        recur(n - 1);
        System.out.println(n);

    }
}
