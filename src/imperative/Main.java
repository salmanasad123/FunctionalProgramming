package imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Anna", Person.Gender.FEMALE),
                new Person("John", Person.Gender.MALE),
                new Person("Linda", Person.Gender.FEMALE),
                new Person("Maria", Person.Gender.FEMALE),
                new Person("Alex", Person.Gender.MALE)
        );


        // Imperative style programming
        List<Person> females = new ArrayList<Person>();

        for (Person person : people) {
            if (Person.Gender.FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println("Female: " + female);
        }

        // Declarative approach
        people
                .stream()
                .filter(person -> person.getGender().equals(Person.Gender.FEMALE))
                .forEach(System.out::println);

    }

}
