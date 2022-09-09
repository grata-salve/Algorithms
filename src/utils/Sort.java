package utils;

import models.Person;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void sortPerson(Person[] people, String sortBy) {
        switch (sortBy) {
            case "Age":
                Arrays.sort(people, Comparator.comparingInt(Person::getAge));
                break;
            case "Height":
                Arrays.sort(people, Comparator.comparingInt(Person::getHeight));
                break;
            case "Weight":
                Arrays.sort(people, Comparator.comparingInt(Person::getWeight));
                break;
        }
    }
}
