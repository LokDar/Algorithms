import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class N_2_OddIndicesTest {
    @Test
    public void testAscendingSequenceHappyPathOddIndices() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        N_2_OddIndices as = new N_2_OddIndices();
        int[] actualResult = as.oddIndices(array);

        //Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
