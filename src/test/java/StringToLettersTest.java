import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersTest {

    @Test
    @Order(1)
    public void testStringToLettersHappyPath() {

        String a = "AB 123 cd @#$%  Ef";
        String expectedResult = "ABcdEf";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult =  stringToLetters.stringToLettersOnly(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
