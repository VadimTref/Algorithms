import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  // for execute in orders @Order()

public class OddindicesTest {

    @Test
    @Order(1)
    public void testOddEvenHappyPathEvenArrayNumbers() {

        //ARRANGE
//        int [] a = new int []{-45, 590, 234, 985, 12, 68};
//        int [] expectedResult = {590, 985, 68};

        // ACT
        // create object of class AscendingSequence
        OddIndices oI = new OddIndices();
//        int [] actualResult = oI.valuesOfOddIndexes(a);

        //ASSERT
        Assertions.assertArrayEquals(new int[]{590, 985, 68},
                oI.valuesOfOddIndexes(new int []{-45, 590, 234, 985, 12, 68}));
    }

    @Test
    @Order(2)
    public void testOddEvenHappyPathOddArrayNumbers() {

        //ARRANGE
//        int [] a = new int []{-45, 590, 234, 985, 12, 68};
//        int [] expectedResult = {590, 985, 68};

        // ACT
        // create object of class AscendingSequence
        OddIndices oI = new OddIndices();
//        int [] actualResult = oI.valuesOfOddIndexes(a);

        //ASSERT
        Assertions.assertArrayEquals(new int[]{590, 985, 68},
                oI.valuesOfOddIndexes(new int []{-45, 590, 234, 985, 12, 68, 32}));
    }

    @Test
    @Order(3)
    public void testOddEvenHappyPathEmptyArray() {

        OddIndices oI = new OddIndices();

        Assertions.assertArrayEquals(new int[]{},
                oI.valuesOfOddIndexes(new int []{}));
    }

    @Test
    @Order(4)
    public void testOddEvenHappyPathAllZero() {

        OddIndices oI = new OddIndices();

        Assertions.assertArrayEquals(new int[]{0, 0},
                oI.valuesOfOddIndexes(new int []{0, 0, 0, 0, 0}));
    }
}