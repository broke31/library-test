import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Moby Dick", "Herman Melville",420, "Narrativa",50);
        Book book2 = new Book("Guida galattica per autostoppisti", "Douglas Adams",42, "fantascienza umoristica",42);
        library.addBook(book1);
        library.addBook(book2);
        System.out.println(library.getBookList().get(0).getTitle());
    }
}
