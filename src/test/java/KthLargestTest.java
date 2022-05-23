import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class KthLargestTest {

    @Test
    @Order(1)
    public void testKthLargestHappyPath() {

        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestElement(a, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testKthLargesHappyPathtKElem() {

        int[] a = {9, 4, 12};
        int k = 3;
        int expectedResult = 4;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestElement(a, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testKthLargestLessThanKElem() {

        int[] a = {9, 4};
        int k = 3;
        int expectedResult = 0;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestElement(a, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testKthLargestKNegative() {

        int[] a = {9, 4};
        int k = -3;
        int expectedResult = 0;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestElement(a, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
