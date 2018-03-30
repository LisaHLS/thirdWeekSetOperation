package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int evenSum = 0;
        if (leftBorder < rightBorder) {

            if (leftBorder%2 == 0) {
                for (int i = leftBorder; i <= rightBorder; i+=2) {
                    evenSum += i;
                }
            } else {
                for (int i = leftBorder+1; i <= rightBorder; i+=2) {
                    evenSum += i;
                }
            }

        } else {
            if (rightBorder%2 == 0) {
                for (int i = rightBorder; i <= leftBorder; i+=2) {
                    evenSum += i;
                }
            } else {
                for (int i = rightBorder+1; i <= leftBorder; i+=2) {
                    evenSum += i;
                }
            }
        }

        return evenSum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int oddSum = 0;
        if (leftBorder < rightBorder) {

            if (leftBorder%2 == 1) {
                for (int i = leftBorder; i <= rightBorder; i+=2) {
                    oddSum += i;
                }
            } else {
                for (int i = leftBorder+1; i <= rightBorder; i+=2) {
                    oddSum += i;
                }
            }

        } else {
            if (rightBorder%2 == 1) {
                for (int i = rightBorder; i <= leftBorder; i+=2) {
                    oddSum += i;
                }
            } else {
                for (int i = rightBorder+1; i <= leftBorder; i+=2) {
                    oddSum += i;
                }
            }
        }
        return oddSum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        int sumOfEachTripleAndAddTwo = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sumOfEachTripleAndAddTwo += arrayList.get(i)*3 + 2;

        }
        return sumOfEachTripleAndAddTwo;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
