import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    @Test
    @Order(1)
    public void testMinMaxAveHappyPath() {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;
        int [] expectedResult = {3, 7, 5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAver(a, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testMinMaxAveEmptyArr() {

        int[] a = {};
        int start = 2;
        int end = 6;
        int [] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAver(a, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testMinMaxNegativeStart() {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = -2;
        int end = 6;
        int [] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAver(a, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testMinMaxStartMoreThanEnd() {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 6;
        int end = 2;
        int [] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAver(a, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void testMinMaxHappyPathEndSubStartEqualLength() {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = 7;
        int [] expectedResult = {1, 8, 4};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAver(a, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(6)
    public void testMinMaxEndSubStartMoreThanLength() {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = 8;
        int [] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAver(a, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(7)
    public void testMinMaxAveArrayOneElementAndZerosIndexes() {

        int[] a = {2};
        int start = 0;
        int end = 0;
        int [] expectedResult = {2, 2, 2};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAver(a, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
