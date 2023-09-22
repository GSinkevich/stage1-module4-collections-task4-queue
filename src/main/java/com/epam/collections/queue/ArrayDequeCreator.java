package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> resultArrayDeque = new ArrayDeque<>();
        Integer SizeResult = firstQueue.size() + secondQueue.size();
        resultArrayDeque.addFirst(Objects.requireNonNull(firstQueue.poll()));
        resultArrayDeque.addFirst(Objects.requireNonNull(firstQueue.poll()));
        resultArrayDeque.addFirst(Objects.requireNonNull(secondQueue.poll()));
        resultArrayDeque.addFirst(Objects.requireNonNull(secondQueue.poll()));

        while (resultArrayDeque.size() != SizeResult)
        {
            firstQueue.add(resultArrayDeque.pollFirst());
            resultArrayDeque.addFirst(Objects.requireNonNull(firstQueue.poll()));
            resultArrayDeque.addFirst(Objects.requireNonNull(firstQueue.poll()));
            secondQueue.add(resultArrayDeque.pollFirst());
            resultArrayDeque.addFirst(Objects.requireNonNull(secondQueue.poll()));
            resultArrayDeque.addFirst(Objects.requireNonNull(secondQueue.poll()));
        }

        return  resultArrayDeque;
    }
}
