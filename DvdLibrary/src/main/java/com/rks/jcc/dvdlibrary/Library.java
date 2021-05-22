package com.rks.jcc.dvdlibrary;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<MovieDvd, Integer> movieCatalogue;

    public Library() {
        this.movieCatalogue = new HashMap<>();
    }

    public boolean containsMovie(MovieDvd movieDvd) {
        return movieCatalogue.containsKey(movieDvd);
    }

    public void donateMovie(MovieDvd movieDvd) {
        if (movieCatalogue.containsKey(movieDvd)) {
            movieCatalogue.put(movieDvd, movieCatalogue.get(movieDvd) + 1);
        } else {
            movieCatalogue.put(movieDvd, 1);
        }
    }

    public int getRentalCopies(MovieDvd movieDvd) {
        if (movieCatalogue.containsKey(movieDvd)) {
            return movieCatalogue.get(movieDvd);
        }
        return 0;
    }
}
