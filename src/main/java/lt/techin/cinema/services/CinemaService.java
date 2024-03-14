package lt.techin.cinema.services;

import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;

public interface CinemaService {

    Cinema getCinemas();

    Seat purchaseSeat(Seat seat);

}
