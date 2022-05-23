import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringIntersectionTest {

    StringIntersection stringIntersection;

    @BeforeEach
    void setUp() {
        stringIntersection = new StringIntersection();
    }

    @Test
    @Order(1)
    public void testStringIntersectionHappyPath(){
        Assertions.assertEquals("car",
                stringIntersection.intersectionOf2Strings
                        ("Carrot", "carwash"));
    }

    @Test
    @Order(2)
    public void testStringIntersectionHappyPath2(){
        Assertions.assertEquals("oo",
                stringIntersection.intersectionOf2Strings
                        ("Noob", "Schmooze"));
    }

    @Test
    @Order(3)
    public void testStringIntersectionHappyPath3(){
        Assertions.assertEquals("qwe",
                stringIntersection.intersectionOf2Strings
                        (".amjdbfqwe", "qwesyk123t"));
    }

    @Test
    @Order(4)
    public void testStringIntersectionHappyPath4(){
        Assertions.assertEquals("o",
                stringIntersection.intersectionOf2Strings
                        ("ROaj", "token"));
    }
}
