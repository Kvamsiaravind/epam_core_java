package practicepatterns.mediatorpattern;

public class MediatorSolution {
    public static void main(String[] args) {
        IATCMediator atcMediator = new ATCMediator();
        Flight airlines1 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);
        atcMediator.registerFlight(airlines1);
        atcMediator.registerRunway(mainRunway);
        airlines1.getReady();
        mainRunway.land();
        airlines1.land();
    }
}
