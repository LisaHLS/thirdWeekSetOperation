package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> oneDimensionalList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                oneDimensionalList.add(array[i][j]);
            }
        }
        return oneDimensionalList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> oneDimensionalUnrepeatedList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!oneDimensionalUnrepeatedList.contains(array[i][j])) {
                    oneDimensionalUnrepeatedList.add(array[i][j]);
                }
            }
        }

        return new ArrayList<>(oneDimensionalUnrepeatedList);
    }
}
