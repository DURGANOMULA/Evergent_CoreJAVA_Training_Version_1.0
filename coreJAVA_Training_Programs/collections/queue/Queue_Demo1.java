package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo1 {
public static void main(String[] args) {
	Queue<Integer> pq=new PriorityQueue<>();
	pq.add(1);
	pq.add(2);
	pq.add(5);
	pq.add(9);
	System.out.println(pq);
	
}
}
