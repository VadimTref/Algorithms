import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  // for execute in orders @Order()

public class OddEvenTest {

    @Test
    @Order(1)
    public void testOddEvenHappyPathNegativeNumber() {

        //ARRANGE
        int a = -345;
        String expectedResult = "Odd";

        // ACT
        // create object of class AscendingSequence
        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        //ASSERT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testOddEvenHappyPathZero() {

        //ARRANGE
        int a = 0;
        String expectedResult = "Even";

        // ACT
        // create object of class AscendingSequence
        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        //ASSERT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testOddEvenHappyPathPositive() {

        //ARRANGE
        int a = 2222;
        String expectedResult = "Even";

        // ACT
        // create object of class AscendingSequence
        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        //ASSERT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testOddEvenOverflowMax() {

        //ARRANGE
        int a = 2147483647 + 1;
        String expectedResult = "Undefined";

        // ACT
        // create object of class AscendingSequence
        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        //ASSERT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void testOddEvenOverflowMin() {

        //ARRANGE
        int a = Integer.MIN_VALUE - 1;
        String expectedResult = "Undefined";

        // ACT
        // create object of class AscendingSequence
        OddEven oE = new OddEven();
        String actualResult = oE.oddOrEvenNumber(a);

        //ASSERT
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

