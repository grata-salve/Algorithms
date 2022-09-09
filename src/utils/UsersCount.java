package utils;

import models.Person;

import java.util.Arrays;

public class UsersCount {
    public static long countUsersWithEqualWeight(Person[] people, int weight) {
        return Arrays.stream(people).parallel().filter(x -> x.getWeight() == weight)
                .distinct().count();
    }
}