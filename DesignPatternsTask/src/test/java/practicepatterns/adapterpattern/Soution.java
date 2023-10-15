package practicepatterns.adapterpattern;

public class Soution {
    public static void main(String args[]) {
        Parrot parrot = new Parrot();
        ToyDuck toyDuck = new PlasticToyDuck();


        ToyDuck birdAdapter = new BirdAdapter(parrot);

        System.out.println("Parrot :");
        parrot.fly();
        parrot.eat();

        System.out.println("ToyDuck :");
        toyDuck.makeSound();

        System.out.println("BirdAdapter :");
        birdAdapter.makeSound();
    }
}
