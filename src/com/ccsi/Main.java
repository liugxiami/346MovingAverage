package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    MovingAverage movingAverage=new MovingAverage(3);
        movingAverage.next(1);
        movingAverage.next(2);
        double avg=movingAverage.next(3);
        double avg1=movingAverage.next(10);
        System.out.println(avg1);
    }
}
class MovingAverage{
    private Queue<Integer> queue=new LinkedList<>();
    private int sum,sumSize;

    public MovingAverage(int sumSize) {
        this.sumSize = sumSize;
        this.sum = 0;
    }

    public double next(int val){
        queue.offer(val);
        sum+=val;
        if(queue.size()>sumSize) sum-=queue.poll();
        return (double) sum/queue.size();
    }
}
