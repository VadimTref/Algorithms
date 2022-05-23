import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CountWordsTest {

    @Test
    @Order(1)
    public void testCountWordsHappyPath() {

        String a = "As of March 2022, Java 18 is the latest version, while Java 17, "
                + "11 and 8 are the current long-term support (LTS) versions. "
                + "Oracle released the last zero-cost public update for the legacy "
                + "version Java 8 LTS in January 2019 for commercial java use, "
                + "although it will otherwise still support Java 8 with public "
                + "updates for personal use indefinitely. "
                + "Other vendors have begun to offer zero-cost builds "
                + "of OpenJDK 8 and 11 that are still receiving security and "
                + "other upgrades.";
        String b = "Java";
        int expectedResult = 5;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWordsInText(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testCountWordsHappyPath2() {

        String a = "As of March 2022, Java 18 is the latest version, while Java 17, "
                + "11 and 8 are the current long-term support (LTS) versions.. "
                + "Oracle released the last zero-cost public update for the legacy "
                + "version Java 8 LTS in January 2019 for commercial java use, "
                + "although it will otherwise still support Java 8 with public updates "
                + "for personal use indefinitely. Other vendors have begun to offer "
                + "zero-cost builds of OpenJDK 8 and 11 that are still receiving "
                + "security and other upgrades";
        String b = "version";
        int expectedResult = 2;

        CountWords countWords = new CountWords();
        int actualResult = countWords.countWordsInText(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
