package com.rks.jcc.dvdlibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DonateMovieDvdTest {

    private Library library;
    private MovieDvd starWars;

    @BeforeEach
    void DonateMovieTest() {
        library = new Library();
        starWars = new MovieDvd("star wars");
        library.donateMovie(starWars);
    }

    @Test
    void testDonateMovie() {
        assertTrue(library.containsMovie(starWars));
    }

    @Test
    void testAddOneRentalCopy() {
        assertEquals(1, library.getRentalCopies(starWars));
    }

    @Test
    void testAddTwoRentalCopies() {
        MovieDvd starWarsDvd2 = new MovieDvd("star wars");
        library.donateMovie(starWarsDvd2);
        assertEquals(2, library.getRentalCopies(starWars));
    }
}
