import models.Person;
import utils.Sort;
import utils.UsersCount;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[100_000];
        Random random = new Random();

        for (int i = 0; i < 100_000; i++) {
            people[i] = new Person(random.nextInt(200 - 140) + 140,
                    random.nextInt(120 - 50) + 50, random.nextInt(100 - 18) + 18);
        }

        Sort.sortPerson(people, "Age");

        for (int i = 0; i < 100000; i+=1000)
            System.out.println(people[i]);

        System.out.println(UsersCount.countUsersWithEqualWeight(people, 50));
    }
}