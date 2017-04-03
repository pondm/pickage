package ru.pdn.pickage.model;

public enum ObjectType {
    ACCOUNT("Account"),
    POSTEVENT("PostEvent"),
    ACCOUNTEVENT("AccountEvent"),
    EVENT("Event"),
    POST("Post"),
    FOLLOWER("Follower"),
    COMMENT("Comment"),
    LIKE("Like");

    private final String description;

    ObjectType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}