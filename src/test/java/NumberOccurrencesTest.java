import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NumberOccurrencesTest {

    @Test
    @Order(1)
    public void testNumberOccurrencesHappyPath() {

        int[] a = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences numberOccurrences = new NumberOccurrences();
        int[][] actualResult = numberOccurrences.numberOfOccurrences(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
