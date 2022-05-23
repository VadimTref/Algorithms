import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @Test
    @Order(1)
    public void testOddEvenHappyPathNegativeNumber() {

        long a = -345L;
        String expectedResult = "Odd";

        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testOddEvenHappyPathZero() {

        long a = 0L;
        String expectedResult = "Even";

        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testOddEvenHappyPathPositive() {

        long a = 2222L;
        String expectedResult = "Even";

        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testOddEvenOverflowMax() {

        long a = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void testOddEvenOverflowMin() {

        long a = -2147483649L;
        String expectedResult = "Undefined";

        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

