import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class N_1_OddEvenTest {
    @Test
    public void testOddEvenHappyPathUndefined() {
        long num = Long.MAX_VALUE;
        String expectedResult = "Undefined";
        N_1_OddEven as = new N_1_OddEven();
        String actualResult = as.oddEven2(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathEven() {
        int num = 2;
        String expectedResult = "Even";
        N_1_OddEven as = new N_1_OddEven();
        String actualResult = as.oddEven2(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathOdd() {
        int num = 3;
        String expectedResult = "Odd";
        N_1_OddEven as = new N_1_OddEven();
        String actualResult = as.oddEven2(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
