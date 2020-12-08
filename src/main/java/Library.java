
import java.util.*;

public class Library {
    Map<String,Book> bookList;

    public Library(Map<String,Book> bookList) {
        this.bookList = bookList;
    }

    public Library() {
        this.bookList = new HashMap<>();
    }

    public Book takeBook(String title) {
        return bookList.get(title);
    }

    public int addBook(Book bookToAdd) {
        if (bookList.get(bookToAdd.getTitle()) != null) {
            bookList.put(bookToAdd.getTitle(), bookToAdd);
            return 0;
        }
        return -1;
    }

    public int deleteBook(String bookToDelete) {
        if (bookList.remove(bookToDelete)!=null)
            return 0;
        return -1;

    }

    public Map<String,Book> getBookList() {
        return bookList;
    }

    public Book buyBook(String title, float price) {
        Book book = takeBook(title);
        if (book != null)
            return book.getPrice() <= price ? book : null;
        return null;
    }
}