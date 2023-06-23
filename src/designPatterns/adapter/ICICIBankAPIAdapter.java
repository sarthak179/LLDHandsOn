package designPatterns.adapter;

import designPatterns.adapter.banks.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPI {
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public void fetchBalance() {
        iciciBankAPI.getBalance();
    }

    @Override
    public void validateCustomer() {
        iciciBankAPI.verifyUser();
    }

    @Override
    public void makeTransaction() {
        iciciBankAPI.transaction();
    }
}
