package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> listOfEachElementTriple = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            listOfEachElementTriple.add(array.get(i)*3);
        }
        return listOfEachElementTriple;
    }

    public List<String> mapLetter() {
        List<String> listOfDigitalMappingAlphabet  = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            listOfDigitalMappingAlphabet.add(letters[array.get(i)-1]);
        }
        return listOfDigitalMappingAlphabet;
    }

    public List<String> mapLetters() {
        List<String> listOfDigitalMappingAlphabets  = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {

            int times = array.get(i)/letters.length;
            if(times == 0) {
                listOfDigitalMappingAlphabets.add(letters[array.get(i)-1]);

            } else if(times <= letters.length){

                if(array.get(i)%letters.length == 0) {
                    listOfDigitalMappingAlphabets.add(letters[times-2] + letters[letters.length-1]);
                } else {
                    listOfDigitalMappingAlphabets.add(letters[times-1] + letters[array.get(i)%letters.length-1]);
                }
            }
        }
        return listOfDigitalMappingAlphabets;
    }

    public List<Integer> sortFromBig() {

        for(int i=1;i<array.size();i++){
            for(int j=i;j>0;j--){
                if (array.get(j-1) < array.get(j)){
                    int temp=array.get(j-1);
                    array.set(j-1,array.get(j));
                    array.set(j,temp);
                }else break;
            }
        }
        return array;
    }

    public List<Integer> sortFromSmall() {
        for(int i=1;i<array.size();i++){
            for(int j=i;j>0;j--){
                if (array.get(j) < array.get(j-1)){
                    int temp=array.get(j-1);
                    array.set(j-1,array.get(j));
                    array.set(j,temp);
                }else break;
            }
        }
        return array;
    }
}
