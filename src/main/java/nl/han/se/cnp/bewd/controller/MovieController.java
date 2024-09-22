package nl.han.se.cnp.bewd.controller;

import nl.han.se.cnp.bewd.domain.Movie;
import nl.han.se.cnp.bewd.exceptions.MovieNotFoundException;
import nl.han.se.cnp.bewd.repository.MovieList;
import nl.han.se.cnp.bewd.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public MovieList getAllMovies() {
        return movieService.getMovieList();
    }

    @GetMapping("/")
    public Movie getMovieById(@RequestParam("id") String id) {

            Movie movie = movieService.getMovieById(id);
        if (movie == null) {
            throw new MovieNotFoundException("Movie with id " + id + " not found");
        }
        return movie;
    }

    @GetMapping("/{id}")
    public Movie getMovieByIdPath(@PathVariable("id") String id) {
        return movieService.getMovieById(id);
    }
}

