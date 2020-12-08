import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.not;

public class LibraryTest {

    private static Library library;
    private Book book;

    @BeforeEach
    public  void setup() {
        library = new Library();
        book = new Book("titolo1","autore1",400,"categoria1",42);
        Book book2 = new Book("titolo2", "autore2", 40, "categoria2", 412);
        library.addBook(book);
        library.addBook(book2);
    }

    @Test
    public void searchBookPresentTest(){
     library.takeBook("titolo1");
    Assertions.assertAll(
            () -> Assertions.assertEquals("titolo1",book.getTitle()),
            () -> Assertions.assertEquals("autore1",book.getAuthors().get(0)),
            () -> Assertions.assertEquals(400,book.getNumbersOfPage()),
            () -> Assertions.assertEquals("categoria1",book.getCategory()),
            () -> Assertions.assertEquals(42, book.getPrice())
            );
    }

    @Test
    public void searchBookNotPresentTest(){
        Book book = library.takeBook("titolo12");
        Assertions.assertNull(book);
    }

    @Test
    public void deleteBookPresentTest(){
        library.deleteBook("titolo1");
        assertThat(library.getBookList(), not(IsMapContaining.hasEntry("titolo1", book)));
    }

    @Test
    public void deleteBookNotPresentTest(){
       int result = library.deleteBook("titolo12");
       Assertions.assertEquals(-1,result);
    }

    @Test
    public void impossibleAddBookTest(){
         library.addBook(book);
        int result =library.addBook(book);

        Assertions.assertEquals(-1,result);

    }

    @AfterAll
    public static void tearDown(){
        library = null;
    }
}
