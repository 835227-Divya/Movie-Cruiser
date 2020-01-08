package com.cognizant.movie.model;

import java.util.List;

import com.cognizant.movie.model.Movie;

public class Favorite {
    private List<Movie> favoriteList;
    private Integer total;

    public Favorite() {
        // TODO Auto-generated constructor stub
    }

    public Favorite(List<Movie> favoriteList, double total) {
        super();
        this.favoriteList = favoriteList;
        this.total = (int) total;
    }

    public List<Movie> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<Movie> favoriteList) {
        this.favoriteList = favoriteList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = (int) total;
    }

    @Override
    public String toString() {
        return "Favorite [total=" + total + ", getTotal()=" + getTotal() + ", hashCode()=" + hashCode()
                + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
    }

}
