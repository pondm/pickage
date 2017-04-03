package ru.pdn.pickage.model;

import java.io.Serializable;

public class PostEvent extends Event implements Serializable {
    private String postId;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "PostEvent{" +
                "postId='" + postId + '\'' +
                '}';
    }
}
