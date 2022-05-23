import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class BiggerValueTest {

    @Test
    @Order(1)
    public void testBiggerValueHappyPathPositiveNumbers() {

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueOfTwo(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testBiggerValueHappyPathPositiveNegativeNumbers() {

        BiggerValue biggerValue = new BiggerValue();

        Assertions.assertEquals(3333,
                biggerValue.biggerValueOfTwo(3333, -9999));
    }

    @Test
    @Order(3)
    public void testBiggerValueHappyPathZeros() {

        BiggerValue biggerValue = new BiggerValue();

       Assertions.assertEquals(0,
                biggerValue.biggerValueOfTwo(0, 0));
    }

    @Test
    @Order(4)
    public void testBiggerValueHappyPathEqualsNumbers() {

        BiggerValue biggerValue = new BiggerValue();

        Assertions.assertEquals(0,
                biggerValue.biggerValueOfTwo(3333, 3333));
    }

    @Test
    @Order(5)
    public void testBiggerValueMinValueInt() {

        BiggerValue biggerValue = new BiggerValue();

        Assertions.assertEquals(0,
                biggerValue.biggerValueOfTwo(Integer.MIN_VALUE, 0));
    }
}
