import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    @Test
    @Order(1)
    public void testIsPositiveNumberHappyPathPositiveNumber() {

        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositive(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testIsPositiveNumberHappyPathZero() {

        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositive(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testIsPositiveNumberHappyPathNegativeNumber() {

        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositive(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testIsPositiveNumberHappyPathMaxIntegerNumber() {

        int a = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositive(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
