import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToDigitsTest {

    @Test
    @Order(1)
    public void testStringToDigitsHappyPath() {

        String a = "AB  123  cd  @#$%Ef";
        String expectedResult = "123";

        StringToDigits stringToDigits = new StringToDigits();
        String actualResult =  stringToDigits.stringToDigitsOnly(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
