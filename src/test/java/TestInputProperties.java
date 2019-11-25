import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.function.IntPredicate;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestInputProperties
{
     @Test
    void isOddShouldReturnTrueForEven() {
        IntPredicate p1 = InputProperties.isOdd();
        assertEquals(true, p1.test(12));
    }

    @Test
    void isOddShouldReturnFalseForOdd() {
        IntPredicate p1 = InputProperties.isOdd();
        assertEquals(false, p1.test(57));
    }

     @Test
    void isPrimeShouldReturnTrueForPrime() {
        IntPredicate p1 = InputProperties.isPrime();
        assertEquals(true, p1.test(31));
    }

    @Test
    void isPrimeShouldReturnFalseForComposite() {
        IntPredicate p1 = InputProperties.isPrime();
        assertEquals(false, p1.test(100));
    }

     @Test
    void isPalindromeShouldReturnTrueForPalindrome() {
        IntPredicate p1 = InputProperties.isPalindrome();
        assertEquals(true, p1.test(101));
    }

    @Test
    void isPalindromeShouldReturnFalseForNonPalindrome() {
        IntPredicate p1 = InputProperties.isPalindrome();
        assertEquals(false, p1.test(58));
    }

    @Test
    void checkShouldCallFunctionalInterfaceMethod() {
        IntPredicate p = Mockito.mock(IntPredicate.class);
        Mockito.when(p.test(5)).thenReturn(true);
        assertEquals(true, InputProperties.check(5, p));
    }
}
