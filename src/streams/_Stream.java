package streams;

import imperative.Person;
import streams.PersonModel.Gender;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<PersonModel> people = List.of(
                new PersonModel("Anna", Gender.FEMALE),
                new PersonModel("John", Gender.MALE),
                new PersonModel("Linda", Gender.FEMALE),
                new PersonModel("Maria", Gender.FEMALE),
                new PersonModel("Alex", Gender.MALE)
        );

        people.stream()
                .map((PersonModel person) -> {
                    return person.getName();
                })
                .map((String name) -> {
                    return name.length();
                })
                .forEach(System.out::println);


    }
}
