package com.Stream_Revision_Problems;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class Question_1 {
    public static void main(String[] args) {
        // 1960-1980
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Thor","Action",1990));
        movies.add(new Movie("Anna","Thriller",1955));
        movies.add(new Movie("Doll","Thriller",1965));
        movies.add(new Movie("New Doll","Thriller",1975));
        movies.add(new Movie("Ghost","Thriller",1988));

        List<Movie> thrillerMovie = movies.stream().filter(mov -> mov.getCategory().equals("Thriller") && mov.getReleaseDate() > 1960 && mov.getReleaseDate() < 1980).collect(Collectors.toList());
        System.out.println("All thriller movies b/w 1960-1980 : "+thrillerMovie);
    }
}


class Movie{
    String name;
    String category;

    int releaseDate;

    public Movie(String name, String category, int releaseDate) {
        this.name = name;
        this.category = category;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}