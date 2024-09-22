package nl.han.se.cnp.bewd.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MovieNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleMovieNotFoundException(MovieNotFoundException ex) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
    }
}
