package controllers;

import models.Person;

public class SortingMethods {


    public void sortByNameWithBubble(Person[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getNombre().compareTo(arr[j + 1].getNombre()) > 0) {
              
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

  
    public void sortByNameWithSelectionDes(Person[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getNombre().compareTo(arr[maxIndex].getNombre()) > 0) {
                    maxIndex = j;
                }
            }
        
            Person temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }


    public void sortByAgeWithInsertion(Person[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Person key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getEdad() > key.getEdad()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public void sortByNameWithInsertion(Person[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Person key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getNombre().compareTo(key.getNombre()) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
