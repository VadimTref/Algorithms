import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RemoveDuplicatesTest {

    RemoveDuplicates removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    @Order(1)
    public void testRemoveDuplicatesHappyPath() {
        Assertions.assertEquals("abc",
                removeDuplicates.removeDuplicatesInString("AABBCCaabbcc"));
    }

    @Test
    @Order(1)
    public void testRemoveDuplicatesHappyPath2() {
        Assertions.assertEquals("abc",
                removeDuplicates.removeDuplicatesInString("A ABBC123Caabbcc"));
    }
}
