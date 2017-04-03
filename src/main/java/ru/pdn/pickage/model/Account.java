package ru.pdn.pickage.model;

import java.io.Serializable;
import java.util.List;

public class Account extends GenericObject implements Serializable {
    private String username;
    private String email;
    private Boolean gender;
    private Boolean priv;
    private String photo;
    private List<Follower> followers;
    private List<Follower> followings;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Boolean getPriv() {
        return priv;
    }

    public void setPriv(Boolean priv) {
        this.priv = priv;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }

    public List<Follower> getFollowings() {
        return followings;
    }

    public void setFollowings(List<Follower> followings) {
        this.followings = followings;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", priv=" + priv +
                ", photo='" + photo + '\'' +
                ", followers=" + followers +
                ", followings=" + followings +
                '}';
    }
}