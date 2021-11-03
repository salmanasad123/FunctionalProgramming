package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getConnectionUrl());

        System.out.println(getConnectionUrlSupplier.get());
    }

    static Supplier<String> getConnectionUrlSupplier = () -> {
        return "jdbc://localhost:5432/users";
    };

    static Supplier<List<String>> getConnectionUrls = () -> {
        return List.of(
                "jdbc://localhost:5432/users",
                "jdbc://localhost:5432/customers",
                "jdbc://localhost:5432/admins"
        );
    };

    static String getConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
