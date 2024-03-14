package lt.techin.cinema.services;

import lt.techin.cinema.exceptions.SeatIsOccupiedException;
import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import org.springframework.stereotype.Service;

@Service

public class CinemaServiceImplement implements CinemaService{

    private Cinema cinema = new Cinema();

    @Override
    public Cinema getCinemas() {
        return cinema;
    }

    @Override
    public Seat purchaseSeat(Seat seat1) {
        if((seat1.getRow()> 9) || (seat1.getColumn()>9)){
            throw new SeatIsOccupiedException("The number of a row or a column is out of bounds!");
        }
        Seat seat = cinema.findSeat(seat1.getRow(), seat1.getColumn());
        if(seat.isOccupied()){
            throw new SeatIsOccupiedException("The ticket is already booked");
        }
        seat.setOccupied(true);
    return seat;
    }
}
