package ru.netology.domain;

public class Like {
    private int count;
    private boolean userLikes;
    private boolean userCanLike;
    private boolean userCanPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isUserCanLike() {
        return userCanLike;
    }

    public void setUserCanLike(boolean userCanLike) {
        this.userCanLike = userCanLike;
    }

    public boolean isUserCanPublish() {
        return userCanPublish;
    }

    public void setUserCanPublish(boolean userCanPublish) {
        this.userCanPublish = userCanPublish;
    }
}
