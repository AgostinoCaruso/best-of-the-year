package org.lessons.java.best_of_the_year.Classes;

public class Song {
    private int id;
    private String title;

    public Song() {

    }

    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title song: " + title;
    }
}