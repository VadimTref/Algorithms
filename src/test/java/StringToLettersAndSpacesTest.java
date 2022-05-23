import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersAndSpacesTest {

    @Test
    @Order(1)
    public void testStringToLettersAndSpacesHappyPath() {

        String a = "AB  123  cd  @#$%Ef";
        String expectedResult = "AB    cd  Ef";

        StringToLettersAndSpaces stringToLettersAndSpaces =
                new StringToLettersAndSpaces();
        String actualResult =  stringToLettersAndSpaces
                .stringToLettersAndSpacesOnly(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
