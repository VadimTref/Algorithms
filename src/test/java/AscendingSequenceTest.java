import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  // for execute in orders @Order()

public class AscendingSequenceTest {
    AscendingSequence aS;

    @BeforeEach     // can execute something in each method
    void setUp() {
        aS = new AscendingSequence();
    }

    @Order(1)
    @RepeatedTest(50)   // 50 times repeat
    @Test
    // always "public void test..." and never static
    public void testAscendingSequenceHappyPathPositiveNumbers() {

        //ARRANGE
        // 0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        // ACT
        // create object "aS" of class AscendingSequence
        //  data type   ob. name      class
//        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        //ASSERT
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumbers() {

        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumbers() {

        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);


        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {

        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingStartLargerThenEnd() {

        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};  // must be empty

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingNegativeStep() {

        int start = 5;
        int end = 0;
        int step = -1;
        int[] expectedResult = {};  // must be empty

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingStepIsZero() {

        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};  // must be empty

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingAllAreZero() {

        int start = 0;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};  // must be empty

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscending() {

        int start = -5;
        int end = 5;
        int step = 2;
        int[] expectedResult = {-5, -3, -1, 1, 3, 5};  // must be empty

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}