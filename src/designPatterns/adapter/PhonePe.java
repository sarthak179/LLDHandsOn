package designPatterns.adapter;

public class PhonePe {
    BankAPI bankAPI;

    public PhonePe() {
        this.bankAPI = new ICICIBankAPIAdapter();
    }

    public void fetchMyBalance() {
        bankAPI.fetchBalance();
    }
    public void verifyMyAccount() {
        bankAPI.validateCustomer();
    }
    public void sendMyMoney() {
        bankAPI.makeTransaction();
    }
}
