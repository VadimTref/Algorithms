import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseStringTest {
    ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Order(1)
    @RepeatedTest(5)
    public void testReverseString() {

        Assertions.assertEquals("arbadacarbA",
                reverseString.reverseStringBack("Abracadabra"));
    }

    @Order(2)
    @RepeatedTest(5)
    public void testReverseString2() {

        Assertions.assertEquals("qwerty54321ytrewq",
                reverseString.reverseStringBack("qwerty12345ytrewq"));
    }
}