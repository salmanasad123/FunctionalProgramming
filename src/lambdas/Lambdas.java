package lambdas;

import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> {
            if (name.isBlank()) {
                throw new IllegalArgumentException("");
            }
            return name.toUpperCase();
        };
    }
}
