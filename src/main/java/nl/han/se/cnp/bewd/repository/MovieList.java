package nl.han.se.cnp.bewd.repository;

import nl.han.se.cnp.bewd.exceptions.GlobalExceptionHandler;
import nl.han.se.cnp.bewd.exceptions.MovieNotFoundException;
import org.springframework.stereotype.Repository;
import nl.han.se.cnp.bewd.domain.Movie;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieList {
    private List<Movie> movieList = new ArrayList<>();

    public MovieList() {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();
        movie1.setId("1");
        movie2.setId("2");
        movie3.setId("3");
        movie1.setName("Dune 2");
        movie2.setName("Twisters");
        movie3.setName("Love Actually");
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
    }

    public List<Movie> getProductList() {
        return movieList;
    }

    public Movie findMovieById(String id) {
        for (Movie movie : movieList) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
       throw new MovieNotFoundException("hallo");
    }

}
