import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MultipleOf3And5Test {

    @Test
    @Order(1)
    public void testMultipleOf3And5HappyPathMultBoth() {

        int m = 15;
        String expectedResult = "Good Number";

        MultipleOf3And5 mult3And5 = new MultipleOf3And5();
        String actualResult = mult3And5.multipleOf3And5(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testMultipleOf3And5HappyPathMult3() {

        MultipleOf3And5 mult3And5 = new MultipleOf3And5();

        Assertions.assertEquals("Bad Number",
                mult3And5.multipleOf3And5(9));
    }

    @Test
    @Order(3)
    public void testMultipleOf3And5HappyPathMult5() {

        MultipleOf3And5 mult3And5 = new MultipleOf3And5();

        Assertions.assertEquals("Poor Number",
                mult3And5.multipleOf3And5(5));
    }

    @Test
    @Order(4)
    public void testMultipleOf3And5NoMult() {

        MultipleOf3And5 mult3And5 = new MultipleOf3And5();

        Assertions.assertEquals("-1", mult3And5.multipleOf3And5(-1));
    }

    @Test
    @Order(5)
    public void testMultipleOf3And5Zero() {

        MultipleOf3And5 mult3And5 = new MultipleOf3And5();

        Assertions.assertEquals("-1", mult3And5.multipleOf3And5(0));
    }

    @Test
    @Order(6)
    public void testMultipleOf3And5NotSatisfy() {

        MultipleOf3And5 mult3And5 = new MultipleOf3And5();

        Assertions.assertEquals("-1", mult3And5.multipleOf3And5(7));
    }
}
