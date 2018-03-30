package com.thoughtworks.collection;

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

        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                evenList.add(array[i]);
            }
        }

        return evenList;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> intersectionList  = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j] && !intersectionList.contains(firstArray[i])) {
                    intersectionList.add(firstArray[i]);
                }
            }
        }
        return intersectionList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {

        List<Integer> unionList  = new ArrayList<>();
        for (int i = 0; i < secondArray.length; i++) {

            boolean sureExit = false;
            for (int j = 0; j < firstArray.length; j++) {

                if(!unionList.contains(firstArray[j])) {
                    unionList.add(firstArray[j]);
                }

                if (secondArray[i] == firstArray[j] ) {
                    sureExit = true;
                }
            }

            if(!sureExit && !unionList.contains(secondArray[i])) {
                unionList.add(secondArray[i]);
            }
        }
        return unionList;
    }
}
