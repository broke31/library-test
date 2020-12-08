import org.junit.jupiter.api.*;

public class BookTest {
    private static Book book;
    @BeforeAll
    public static void setup(){
        //String title, List<String> authors, int numbersOfPage, String category, float price
        book = new Book("titolo1","autore",400,"categoria",42);
    }
    @Test
    public void checkTitleBookTest(){
        Assertions.assertEquals(book.getTitle(),"titolo1");
    }

    @AfterAll
    public static void tearDown(){
        book = null;
    }

}
