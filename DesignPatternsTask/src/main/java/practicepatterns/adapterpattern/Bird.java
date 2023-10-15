package practicepatterns.adapterpattern;

public interface Bird {
    public void eat();

    public void fly();
}

class Parrot implements Bird {
    public void fly() {
        System.out.println("flying");
    }

    public void eat() {
        System.out.println("eating pea nuts..");
    }
}

interface ToyDuck {
    public void makeSound();
}

class PlasticToyDuck implements ToyDuck {
    public void makeSound() {
        System.out.println("tik tik tik");
    }
}

class BirdAdapter implements ToyDuck {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void makeSound() {
        bird.fly();
    }
}
