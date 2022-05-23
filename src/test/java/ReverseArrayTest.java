import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {

    ReverseArray reverseArray;

    @BeforeEach
    void setUp() {
        reverseArray = new ReverseArray();
    }

    @Order(1)
    @RepeatedTest(5)
    public void testReverseHappyPathArray() {

        int [] array = {2, 7, 3, 10};
        int [] expectedResult = {10, 3, 7, 2};

        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @RepeatedTest(5)
    public void testReverseArrayEmpty() {

        int [] array = {};
        int [] expectedResult = {};

        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @RepeatedTest(5)
    public void testReverseArrayOneElement() {

        int [] array = {5};
        int [] expectedResult = {5};

        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
