package lambda;

interface RotationInterface {
    public void stringComparison(String stringOne, String stringTwo);
}

public class StringRotations {

    public static void main(String[] args) {

        RotationInterface rotationInterface = (String stringOne, String stringTwo) -> {
            long lengthOfStringOne = stringOne.length();
            long lengthOfStringTwo = stringTwo.length();
            if (lengthOfStringTwo != lengthOfStringOne) {
                System.out.println("No, it is not possible to create.");
            } else {
                stringOne = stringOne + stringOne;
                int index = stringOne.indexOf(stringTwo.charAt(0));
                if (stringOne.contains(stringTwo)) {
                    System.out.println("Yes , it is possible.");
                } else {
                    System.out.println("Two strings didn't match after doing rotations also.");
                }
            }
        };
        RotationClass rotationClass = new RotationClass();
        rotationClass.check(rotationInterface);
    }
}

class RotationClass {
    public void check(RotationInterface rotationInterface) {
        String stringOne = "ABCD";
        String stringTwo = "CDAB";
        rotationInterface.stringComparison(stringOne, stringTwo);
    }
}
