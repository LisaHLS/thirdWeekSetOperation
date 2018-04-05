package com.thoughtworks.collection;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size()-1);
    }

    public double getMinimum() {
        Collections.sort(arrayList);
        return arrayList.get(0);
    }

    public double getAverage() {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < arrayList.size(); i++) {
                sum += arrayList.get(i);
                num += 1;
        }
        double average = (double)sum/num;
        return average;
    }

    public double getOrderedMedian() {

        double median = 0.0;
        int listSize = arrayList.size();
        if (listSize%2 == 0) {
            median = (arrayList.get(listSize/2) + arrayList.get(listSize/2 - 1))/2.0;
        } else {
            median = arrayList.get(listSize/2);
        }

        return median;
    }

    public int getFirstEven() {
        int firstEven = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) {
                firstEven = arrayList.get(i);
                break;
            }
        }
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        int firstEvenIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }
        return firstEvenIndex;
    }

    public boolean isEqual(List<Integer> diffArrayList) {

        boolean isEqual = true;
        if (diffArrayList.size() == arrayList.size()) {

            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i) != diffArrayList.get(i)) {
                    isEqual = false;
                    break;
                }
            }

        } else {
            isEqual = false;
        }

        return isEqual;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {

        double median = 0.0;
        for(Integer item : arrayList) {
            singleLink.addTailPointer(item);
        }
        int listSize = arrayList.size();
        if (listSize%2 == 0) {
            median = ((int)singleLink.getNode(listSize/2) + (int)singleLink.getNode(listSize/2 + 1))/2.0;
        } else {
            median = (double)singleLink.getNode(listSize/2 + 1);
        }

        return median;
    }

    public int getLastOdd() {
        int lastOdd = 0;
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if (arrayList.get(i)%2 == 1) {
                lastOdd = arrayList.get(i);
                break;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        int lastOddIndex = 0;
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if (arrayList.get(i)%2 == 1) {
                lastOddIndex = i;
                break;
            }
        }
        return lastOddIndex;
    }
}
