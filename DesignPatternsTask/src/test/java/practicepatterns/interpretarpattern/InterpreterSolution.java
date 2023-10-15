package practicepatterns.interpretarpattern;

import practicepatterns.interpreterpattern.AndExpression;
import practicepatterns.interpreterpattern.Expression;
import practicepatterns.interpreterpattern.OrExpression;
import practicepatterns.interpreterpattern.TerminalExpression;

public class InterpreterSolution {
    public static void main(String[] args) {
        Expression person1 = new TerminalExpression("Gouse");
        Expression person2 = new TerminalExpression("Dharma");
        Expression isSingle = new OrExpression(person1, person2);

        Expression vikram = new TerminalExpression("Pramod");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpreter("Gouse"));
        System.out.println(isSingle.interpreter("Dharma"));
        System.out.println(isSingle.interpreter("Achint"));

        System.out.println(isCommitted.interpreter("Committed, Pramod"));
        System.out.println(isCommitted.interpreter("Single, Pramod"));
    }
}
