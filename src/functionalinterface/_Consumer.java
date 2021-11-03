package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "999999");
        greetCustomer(maria);

        System.out.println("------------------------------------------------");

        greetCustomerConsumer.accept(maria);

        System.out.println("------------------------------------------------");

        greetCustomerConsumerV2.accept(maria, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (Customer customer, Boolean showPhoneNumber) -> {
        System.out.println("Hello " + customer.customerName + " thank you for registering " +
                "phone number " + (showPhoneNumber ? customer.phoneNumber : "******"));
    };

    static Consumer<Customer> greetCustomerConsumer = (Customer customer) -> {
        System.out.println("Hello " + customer.customerName + " thank you for registering " +
                "phone number " + customer.phoneNumber);
    };

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " thank you for registering " +
                "phone number " + customer.phoneNumber);
    }

    static class Customer {
        private String customerName;
        private String phoneNumber;

        public Customer(String customerName, String phoneNumber) {
            this.customerName = customerName;
            this.phoneNumber = phoneNumber;
        }
    }
}
