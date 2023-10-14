package lambda;

interface Runnable {
    public void run(int number);
}

public class RunnableInterface {
    public static void main(String[] args) {
        Runnable runnable = (number -> {
            System.out.println("Printing numbers using run() method in Runnable interface :");
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }
        });
        RunnableClass runnableClass = new RunnableClass();
        runnableClass.display(runnable);
    }
}

class RunnableClass {
    public void display(Runnable runnable) {
        runnable.run(10);
    }
}
