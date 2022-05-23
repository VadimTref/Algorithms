import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    @Test
    @Order(1)
    public void testIntersectionHappyPath1() {

        int[] a = {1, 2, 4, 5, 89};
        int[] b = {8, 9, 4, 2};
        int [] expectedResult = {2, 4};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAB(a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testIntersectionHappyPath2() {

        int[] a = {1, 2, 4, 5, 8, 9};
        int[] b = {8, 9, -4, -2};
        int [] expectedResult = {8, 9};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAB(a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testIntersectionHappyPath3() {

        int[] a = {1, 2, 4, 5, 89};
        int[] b = {8, 9, 45};
        int [] expectedResult = {};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAB(a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testIntersectionEmpty() {

        int[] a = {};
        int[] b = {8, 9, 45};
        int [] expectedResult = {};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAB(a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
