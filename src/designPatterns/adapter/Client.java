package designPatterns.adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.fetchMyBalance();
        phonePe.verifyMyAccount();
        phonePe.sendMyMoney();
    }
}
