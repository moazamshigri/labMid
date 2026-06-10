import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void positiveTestPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.isPalindrome("madam");

        assertTrue(result);
    }

    @Test
    public void negativeTestNotPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.isPalindrome("civic");

        assertFalse(result);
    }
}