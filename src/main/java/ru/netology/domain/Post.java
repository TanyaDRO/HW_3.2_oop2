package ru.netology.domain;

public class Post {
    private int id;
    private User author;
    private String date;
    private String text;
    private String bannerUrl;
    private int likesCounter;
    private int repostsCounter;
    private int viewsCounter;
    private Comment[] comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public int getLikesCounter() {
        return likesCounter;
    }

    public void setLikesCounter(int likesCounter) {
        this.likesCounter = likesCounter;
    }

    public int getRepostsCounter() {
        return repostsCounter;
    }

    public void setRepostsCounter(int repostsCounter) {
        this.repostsCounter = repostsCounter;
    }

    public int getViewsCounter() {
        return viewsCounter;
    }

    public void setViewsCounter(int viewsCounter) {
        this.viewsCounter = viewsCounter;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}