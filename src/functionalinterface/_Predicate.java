package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("0000000"));

        System.out.println(isPhoneNumberValidPredicate.test("07634347343"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("07654838667"));

        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3Predicate).test("07654898667"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = (String phoneNumber) -> {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    };

    static Predicate<String> containsNumber3Predicate = (String phoneNumber) -> {
        return phoneNumber.contains("3");
    };

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
