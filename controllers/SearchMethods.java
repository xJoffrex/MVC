package controllers;

import models.Person;

public class SearchMethods {


    public boolean isSortedByAge(Person[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getEdad() < arr[i - 1].getEdad()) {
                return false;
            }
        }
        return true;
    }


    public boolean isSortedByName(Person[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getNombre().compareTo(arr[i - 1].getNombre()) < 0) {
                return false;
            }
        }
        return true;
    }

 
    public Person binarySearchByAge(Person[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid].getEdad() == target) {
                return arr[mid];
            }
            if (arr[mid].getEdad() < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

   
    public Person binarySearchByName(Person[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = arr[mid].getNombre().compareTo(target);
            if (comparison == 0) {
                return arr[mid];
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
