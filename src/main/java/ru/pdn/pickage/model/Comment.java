package ru.pdn.pickage.model;

import java.io.Serializable;

public class Comment extends PostEvent implements Serializable {
    private String accountId;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                ", accountId='" + accountId + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
