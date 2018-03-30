package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> listOfNumberDivideToSmaller = new ArrayList<>();
        for (int i = number - random.nextInt(3); i > 0 ; i-= random.nextInt(3)) {
            listOfNumberDivideToSmaller.add(i);
        }
        return listOfNumberDivideToSmaller;
    }
}
