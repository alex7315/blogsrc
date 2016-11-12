package io.github.mnkartik.modal.reqmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mnkartik.modal.entity.MovieInfo;


public class AddMovieReq {
    @JsonProperty("title")
    private String movieTitle;
    @JsonProperty("year")
    private int year;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public MovieInfo convert(){
        return new MovieInfo(this.movieTitle,this.year);
    }

    @Override
    public String toString() {
        return String.format("AddMovieReq [ movieTitle = {}, year = {}]", movieTitle, year);
    }
}
