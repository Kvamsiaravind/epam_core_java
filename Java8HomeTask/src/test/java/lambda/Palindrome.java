
package lambda;

interface PalindromeInterface {
    void validatePalindrome(String string);
}

public class Palindrome {
    public static void main(String[] args) {

        PalindromeInterface palindromeInterface = (String input) -> {

            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            System.out.println(sb.toString().equalsIgnoreCase(input) ? "Palindrome" : "Not a palindrome");
        };
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        palindromeCheck.check(palindromeInterface);
    }
}

class PalindromeCheck {

    public void check(PalindromeInterface palindromeInterface) {
        String string = "Madam";
        palindromeInterface.validatePalindrome(string);
    }
}
