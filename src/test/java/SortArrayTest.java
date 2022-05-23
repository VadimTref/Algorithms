import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SortArrayTest {

    @Test
    @Order(1)
    public void testSortArrayHappyPath() {

        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortArr = new SortArray();
        int[] actualResult = sortArr.sortArray(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testSortArrayHappyPathNegativeZero() {

        int[] a = {4, 3, 7, -12, 5, 0, 2, -9, 4, 12};
        int [] expectedResult = {-12, -9, 0, 2, 3, 4, 4, 5, 7, 12};

        SortArray sortArr = new SortArray();
        int[] actualResult = sortArr.sortArray(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testSortArrayEmpty() {

        int[] a = {};
        int [] expectedResult = {};

        SortArray sortArr = new SortArray();
        int[] actualResult = sortArr.sortArray(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
