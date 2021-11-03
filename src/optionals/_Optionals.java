package optionals;

import java.util.Optional;

public class _Optionals {

    public static void main(String[] args) {
        Object value = Optional.ofNullable("hello")
                .orElseGet(() -> {
                    return "Default value";
                });

        System.out.println(value);
    }
}
