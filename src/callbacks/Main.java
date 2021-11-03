package callbacks;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<String> callback = (String value) -> {
            System.out.println("last name not provided for " + value);
        };

        hello("John", null, callback);
    }


    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }


}


// java script

//    function hello(firstName, lastName, callback){
//        console.log(firstName);
//        if(lastName){
//            console.log(lastName);
//        }else {
//            callback();
//        }
//    }