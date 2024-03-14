package lt.techin.cinema.exceptions.handler;


import lt.techin.cinema.exceptions.SeatIsOccupiedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SeatIsOccupiedException.class)
    public ResponseEntity<MessageDetails> exceptionSeatIsOccupiedHandler(SeatIsOccupiedException exeption){
        MessageDetails messageDetails = new MessageDetails(exeption.getMessage());
        return new ResponseEntity<>(messageDetails, HttpStatus.BAD_REQUEST);
    }
}
