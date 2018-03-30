package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> intervalList = new ArrayList<>();
        if(left < right) {
            for (int i = left; i <= right ; i++) {
                intervalList.add(i);
            }

        } else {
            for (int i = left; i >= right ; i--) {
                intervalList.add(i);
            }
        }

        return intervalList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        List<Integer> intervalEvenList = new ArrayList<>();
        if(left < right) {

            if (left % 2 == 0) {
                for (int i = left; i <= right; i += 2) {
                    intervalEvenList.add(i);
                }

            } else {
                for (int i = left + 1; i <= right; i += 2) {
                    intervalEvenList.add(i);
                }
            }

        } else {
            if (left % 2 == 0) {
                for (int i = left; i >= right; i -= 2) {
                    intervalEvenList.add(i);
                }

            } else {
                for (int i = left - 1; i >= right; i -= 2) {
                    intervalEvenList.add(i);
                }
            }
        }

        return intervalEvenList;
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
