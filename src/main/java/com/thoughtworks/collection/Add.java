package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
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

        List<Integer> oddTripleAndAddTwoButEvenNoChangeList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) % 2 == 1) {
                oddTripleAndAddTwoButEvenNoChangeList.add(arrayList.get(i) * 3 + 2);

            } else {
                oddTripleAndAddTwoButEvenNoChangeList.add(arrayList.get(i));
            }
        }
        return oddTripleAndAddTwoButEvenNoChangeList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {

        int sumOfEachOddTripleAndAddFive = 0;

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) % 2 == 1) {
                sumOfEachOddTripleAndAddFive += arrayList.get(i)*3 + 5;
            }
        }
        return sumOfEachOddTripleAndAddFive;

    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {

        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) {
                evenList.add(arrayList.get(i));
            }
        }

        double median = 0.0;
        int evenListSize = evenList.size();
        if (evenListSize%2 == 0) {
            median = (evenList.get(evenListSize/2) + evenList.get(evenListSize/2 - 1))/2;
        } else {
            median = evenList.get(evenListSize/2);
        }

        return median;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {

        int evenSum = 0;
        int evenNum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) {
                evenSum += arrayList.get(i);
                evenNum += 1;
            }
        }
        double averageOfEven = evenSum/evenNum;
        return averageOfEven;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) {
                evenList.add(arrayList.get(i));
            }
        }
        return evenList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {

        List<Integer> listOfThreeTimeSumOfFormerAndLatter = new ArrayList<>();
        for (int i = 1; i < arrayList.size(); i++) {
            listOfThreeTimeSumOfFormerAndLatter.add((arrayList.get(i) + arrayList.get(i-1))*3);
        }
        return listOfThreeTimeSumOfFormerAndLatter;
    }
}
