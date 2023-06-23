package designPatterns.adapter.banks;

public class YesBankAPI {
    public void queryBalance() {
        System.out.println("Yes bank balance is x Rs");
    }

    public void validateUser() {
        System.out.println("User successfully validated by Yes bank");
    }

    public void doTransaction() {
        System.out.println("Transaction success Yes Bank");
    }
}
