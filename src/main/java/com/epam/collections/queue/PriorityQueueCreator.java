package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Comparator myComparator =  new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        };

        PriorityQueue<String> mPriorityQueue = new PriorityQueue<>(myComparator);

        mPriorityQueue.addAll(firstList);
        mPriorityQueue.addAll(secondList);

           return  mPriorityQueue;

    }
}
