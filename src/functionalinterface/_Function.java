package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment = incrementByOne(0);
        System.out.println(increment);

        System.out.println("////////////////////////////////////////////");

        Integer increment1 = incrementByOneFunction.apply(1);
        System.out.println(increment1);

        int multiply = multipleBy10Function.apply(increment1);
        System.out.println(multiply);

        System.out.println("////////////////////////////////////////////");

        Function<Integer, Integer> add1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(add1AndThenMultiplyBy10.apply(4));


        System.out.println("////////////////////////////////////////////");

        Integer resultOfBiFunction = incrementByOneAndMultiplyBiFunction.apply(10, 10);
        System.out.println(resultOfBiFunction);

    }

    static Function<Integer, Integer> incrementByOneFunction = (Integer i) -> {
        return i + 1;
    };

    static Function<Integer, Integer> multipleBy10Function = (Integer i) -> {
        return i * 10;
    };

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (Integer i, Integer j) -> {
                return (i + 1) * j;
            };


    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
