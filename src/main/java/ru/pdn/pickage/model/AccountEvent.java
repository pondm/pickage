package ru.pdn.pickage.model;

import java.io.Serializable;

public class AccountEvent extends Event implements Serializable {
    private String accountId;

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return "AccountEvent{" +
                "accountId='" + accountId + '\'' +
                '}';
    }
}
