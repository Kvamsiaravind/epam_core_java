package SingleResponsibilityPrinciple.After;

public class ReservationService {
    int availableSeats=60;
    public String bookTicket(int numberOfSeats) {
        if(numberOfSeats <= availableSeats)
            return "Tickets Booked";
        return "required no.of tickets not available";
    }
}
