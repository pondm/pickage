package ru.pdn.pickage.model;

import java.io.Serializable;
import java.util.List;

public class Post extends AccountEvent implements Serializable {
    private List<Comment> comments;
    private List<Like> likes;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "comments=" + comments +
                ", likes=" + likes +
                '}';
    }
}
