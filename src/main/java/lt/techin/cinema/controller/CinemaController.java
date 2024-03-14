package lt.techin.cinema.controller;

import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import lt.techin.cinema.services.CinemaService;
import org.springframework.web.bind.annotation.*;

@RestController


public class CinemaController {

    CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    @RequestMapping("/seats")
    public Cinema getCinema(){
        return cinemaService.getCinemas();
    }

    @PostMapping
    @RequestMapping("/purchase")
    public Seat purchaseSeat(@RequestBody Seat seat1){

    return cinemaService.purchaseSeat(seat1);
    }

}
