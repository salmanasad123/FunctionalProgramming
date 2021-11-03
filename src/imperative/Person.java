package imperative;

public class Person {

    private final String name;
    private final Gender gender;

    enum Gender {
        MALE, FEMALE
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "imperative.Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
