package ru.netology.domain;

public class Comment {
    private int count;
    private boolean userCanPost;
    private boolean groupsCanPost;
    private boolean userCanClose;
    private boolean userCanOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserCanPost() {
        return userCanPost;
    }

    public void setUserCanPost(boolean userCanPost) {
        this.userCanPost = userCanPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isUserCanClose() {
        return userCanClose;
    }

    public void setUserCanClose(boolean userCanClose) {
        this.userCanClose = userCanClose;
    }

    public boolean isUserCanOpen() {
        return userCanOpen;
    }

    public void setUserCanOpen(boolean userCanOpen) {
        this.userCanOpen = userCanOpen;
    }
}
