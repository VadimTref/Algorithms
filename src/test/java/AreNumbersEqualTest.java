import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Test
    @Order(1)
    public void testAreNumbersEqualHappyPathEqualsNumbers() {

        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersIsEquals(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testAreNumbersEqualHappyPathNotEqualsNumbers() {

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersIsEquals(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testAreNumbersEqualHappyPathNotEqualsNumbers1() {

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersIsEquals(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
