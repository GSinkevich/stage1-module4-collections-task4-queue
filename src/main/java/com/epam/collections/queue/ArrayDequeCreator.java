package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {


    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {


        ArrayDeque<Integer> resultArrayDeque = new ArrayDeque<>();
        int SizeResult = firstQueue.size() + secondQueue.size();

        AddTwoCards(firstQueue,resultArrayDeque);
        AddTwoCards(secondQueue,resultArrayDeque);

        while (resultArrayDeque.size() != SizeResult)
        {
            firstQueue.add(resultArrayDeque.pollLast());
            AddTwoCards(firstQueue,resultArrayDeque);
            secondQueue.add(resultArrayDeque.pollLast());
            AddTwoCards(secondQueue,resultArrayDeque);

        }
        return  resultArrayDeque;
    }

    private void AddTwoCards(Queue<Integer> firstQueue,ArrayDeque<Integer> resultArrayDeque) {
        resultArrayDeque.addLast(Objects.requireNonNull(firstQueue.poll()));
        resultArrayDeque.addLast(Objects.requireNonNull(firstQueue.poll()));
    }
}


