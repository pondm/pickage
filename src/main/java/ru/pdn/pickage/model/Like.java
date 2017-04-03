package ru.pdn.pickage.model;

import java.io.Serializable;

public class Like extends PostEvent implements Serializable {
    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Like{" +
                "accountId='" + accountId + '\'' +
                '}';
    }
}
