package com.umsa.mispeliculas.movies.models;

/**
 * Created by growcallisaya on 10/24/17.
 */

public class Movie {
    String name;
    String cover;

    public Movie(String name, String cover) {
        this.name = name;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
