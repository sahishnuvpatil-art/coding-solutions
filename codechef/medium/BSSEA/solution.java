import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] seats = new int[n];
        
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }
        
  
        int minSeat = Arrays.stream(seats).min().getAsInt();
        int maxSeat = Arrays.stream(seats).max().getAsInt();
        
        
        double center = (minSeat + maxSeat) / 2.0;
        
        int bestSeat = seats[0];
        double bestDist = Math.abs(seats[0] - center);
        
        for (int seat : seats) {
            double dist = Math.abs(seat - center);
            if (dist < bestDist || (dist == bestDist && seat < bestSeat)) {
                bestSeat = seat;
                bestDist = dist;
            }
        }
        
        System.out.println(bestSeat);
    }
}
