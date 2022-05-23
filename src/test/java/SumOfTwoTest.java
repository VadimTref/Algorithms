import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumOfTwoTest {

    @Test
    @Order(1)
    public void testSumOfTwoHappyPath() {

        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12, 0};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}, {12, 0}, {12, 0}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoEl(a, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testSumOfTwoHappyPathTwoElements() {

        int[] a = {12, 2};
        int n = 14;
        int[][] expectedResult = {{12, 2}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoEl(a, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testSumOfTwoTwoElementsAndNoSum() {

        int[] a = {12, 2};
        int n = 0;
        int[][] expectedResult = {};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoEl(a, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testSumOfTwoOneElement() {

        int[] a = {12};
        int n = 12;
        int[][] expectedResult = {};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoEl(a, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
