import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Test
    @Order(1)
    public void testSumArrayHappyPathPositiveNumbers() {

        int [] a = new int []{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumOfArray(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testSumArrayHappyPathNegativeNumbers() {

        int [] a = new int []{-7, -3};
        int expectedResult = -10;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumOfArray(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testSumArrayHappyPathDiffNumbers() {

        int [] a = new int []{-7, 7, -3, 3};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumOfArray(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testSumArrayHappyPathZero() {

        int [] a = new int []{0};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumOfArray(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testSumArrayEmptyArray() {

        int [] a = new int []{};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumOfArray(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
