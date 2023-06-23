package designPatterns.adapter;

import designPatterns.adapter.banks.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public void fetchBalance() {
        yesBankAPI.queryBalance();
    }

    @Override
    public void validateCustomer() {
        yesBankAPI.validateUser();
    }

    @Override
    public void makeTransaction() {
        yesBankAPI.doTransaction();
    }
}
