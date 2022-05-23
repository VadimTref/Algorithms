import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NegativeOnTheRightTest {

    @Test
    @Order(1)
    public void testNegativeOnTheRightHappyPath() {

        int[] a = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int [] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int [] actualResult = negativeOnTheRight.negativeElOnTheRight(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
