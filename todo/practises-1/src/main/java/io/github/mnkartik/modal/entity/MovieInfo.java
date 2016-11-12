package io.github.mnkartik.modal.entity;


public class MovieInfo {
    private int id;
    private String title;
    private int year;

    public MovieInfo(String title, int year){
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return String.format("MovieInfo [ id = {}, title = {}, year = {}]", id, title, year);
    }
}

