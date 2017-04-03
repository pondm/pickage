package ru.pdn.pickage.model;

import java.io.Serializable;

public class Follower extends Event implements Serializable{
    private String follower;

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "follower='" + follower + '\'' +
                '}';
    }
}