package designPatterns.adapter.banks;

public class ICICIBankAPI {
    public void getBalance() {
        System.out.println("ICICI bank balance is x Rs");
    }

    public void verifyUser() {
        System.out.println("User successfully verifired by ICICI bank");
    }

    public void transaction() {
        System.out.println("Transaction success ICICI Bank");
    }
}
