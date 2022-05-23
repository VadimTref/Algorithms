import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToDigitsAndSpacesTest {

    @Test
    @Order(1)
    public void testStringToDigitsAndSpacesHappyPath() {

        String a = "AB  123  cd  123@#$%Ef";
        String expectedResult = "  123    123";

        StringToDigitsAndSpaces stringToDigitsAndSpaces =
                new StringToDigitsAndSpaces();
        String actualResult =  stringToDigitsAndSpaces
                .stringToDigitsAndSpacesOnly(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
