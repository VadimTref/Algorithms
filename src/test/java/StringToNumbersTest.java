import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersTest {

    @Test
    @Order(1)
    public void testStringToNumbersHappyPath() {

        String a = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers  stringToNumbers = new StringToNumbers();
        int[] actualResult =  stringToNumbers.stringToArrNumbers(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testStringToNumbersEmpty() {

        String a = "";
        int[] expectedResult = {};

        StringToNumbers  stringToNumbers = new  StringToNumbers();
        int[] actualResult =  stringToNumbers.stringToArrNumbers(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testStringToNumbersLetterInString() {

        String a = "a, 1, 2";
        int[] expectedResult = {1, 2};

        StringToNumbers  stringToNumbers = new  StringToNumbers();
        int[] actualResult =  stringToNumbers.stringToArrNumbers(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
