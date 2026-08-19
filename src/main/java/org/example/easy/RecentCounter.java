package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {

    List<Integer> queue;

    public RecentCounter() {
        queue = new ArrayList<>();
    }

    public int ping(int t) {
        queue.add(t);

        int count = 0;
        int i = queue.size() - 1;
        int lowerBound = t - 3000;

        while ( i >= 0 && queue.get(i) >= lowerBound && queue.get(i) <= t ){
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        counter.ping(1);     // requests = [1], range is [-2999,1], return 1
        counter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
        counter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3



        System.out.println(counter.ping(3002));
    }
}
