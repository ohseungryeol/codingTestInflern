package Sorting;

import java.util.Scanner;
import java.util.*;

public class 좌표정렬{
    static class Point implements Comparable<Point>{
        int x,y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x==o.x){
                return this.y-o.y;
            }
            return this.x-o.x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i=0; i<N; i++){
            int x =sc.nextInt();
            int y =sc.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for (int i=0; i<N; i++){
            System.out.println(arr.get(i).x+" "+arr.get(i).y);
        }
    }
}
