import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {

    @Test
    @Order(1)
    public void testPeakElementHappyPath() {

        int[] a = {3, 2, 7, 5, 1, 9, 23, 1};
        int [] expectedResult = {3, 7, 23};

        PeakElement peakEl = new PeakElement();
        int[] actualResult = peakEl.peakElement(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testPeakElementOneElement() {

        int[] a = {1};
        int [] expectedResult = {};

        PeakElement peakEl = new PeakElement();
        int[] actualResult = peakEl.peakElement(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testPeakElementNoPeaks() {

        int[] a = {3, 3, 3, 3, 3, 3};
        int [] expectedResult = {};

        PeakElement peakEl = new PeakElement();
        int[] actualResult = peakEl.peakElement(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testPeakElementOnePeak() {

        int[] a = {3, 3, 5, 3, 3, 3};
        int [] expectedResult = {5};

        PeakElement peakEl = new PeakElement();
        int[] actualResult = peakEl.peakElement(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void testPeakElementEmptyArray() {

        int[] a = {};
        int [] expectedResult = {};

        PeakElement peakEl = new PeakElement();
        int[] actualResult = peakEl.peakElement(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
