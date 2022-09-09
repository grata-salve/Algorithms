package utils;

import models.Person;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UsersCount {
    public static int countUsersWithEqualWeight(Person[] people, int weight) {
        return Arrays.stream(people).parallel().filter(x -> x.getWeight() == weight)
                .map(Person::getHeight).collect(Collectors.toSet()).size();
    }
}
