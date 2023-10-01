package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> determineDishOrderRes = new ArrayList<>();
        List<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        int step = everyDishNumberToEat-1;
        int i = 0;

        while (!queue.isEmpty()) {
            i = (i + step) % queue.size();
            int n = queue.remove(i);
            determineDishOrderRes.add(n);
        }
        return determineDishOrderRes;
    }
}
