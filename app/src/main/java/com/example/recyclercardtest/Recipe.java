package com.example.recyclercardtest;

public class Recipe {
    private int id;
    private String title, tags, cooking_time, serving;
    private int image;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTags() {
        return tags;
    }

    public String getCooking_time() {
        return cooking_time;
    }

    public String getServing() {
        return serving;
    }

    public int getImage() {
        return image;
    }

    public Recipe(int id, String title, String tags, String cooking_time, String serving, int image) {
        this.id = id;
        this.title = title;
        this.tags = tags;
        this.cooking_time = cooking_time;
        this.serving = serving;
        this.image = image;
    }
}
