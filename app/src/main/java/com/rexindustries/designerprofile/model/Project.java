package com.rexindustries.designerprofile.model;

public class Project {

    private int image;
//    private String name;
//    private int likes;

    public Project(int image) {
        this.image = image;
//        this.name = name;
//        this.likes = likes;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getLikes() {
//        return likes;
//    }
//
//    public void setLikes(int likes) {
//        this.likes = likes;
//    }
}
