package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {this.array = array;}

    public List<Integer> filterEven() {
        List<Integer>  evenList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2 == 0) {
                evenList.add(array.get(i));
            }
        }
        return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer>  multipleOfThreeList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%3 == 0) {
                multipleOfThreeList.add(array.get(i));
            }
        }
        return multipleOfThreeList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        throw new NotImplementedException();
    }
}