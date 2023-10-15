package DependencyInversionPrinciple.Before;

public class TicketBookingApp {
    private DebitCard debitCard;

    public TicketBookingApp(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPayment(int noOfTickets, int amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        TicketBookingApp ticketApp = new TicketBookingApp(debitCard);
        ticketApp.doPayment(4,5000);
    }

}
class DebitCard {
    public void doTransaction(int amount) {
        System.out.println("tx done with DebitCard");
    }
}
class CreditCard {
    public void doTransaction(int amount) {
        System.out.println("tx done with CreditCard");
    }
}

