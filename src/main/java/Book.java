import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<String> authors;
    int numbersOfPage;
    String category;
    float price;

    public Book() {
        this.title = "";
        this.authors = new ArrayList<>();
        this.numbersOfPage = 0;
        this.category = "";
        this.price = 0.0f;
    }

    public Book(String title, List<String> authors, int numbersOfPage, String category, float price) {
        this.title = title;
        this.authors = authors;
        this.numbersOfPage = numbersOfPage;
        this.category = category;
        this.price = price;
    }
    public Book(String title, String author, int numbersOfPage, String category, float price) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(author);
        this.numbersOfPage = numbersOfPage;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getNumbersOfPage() {
        return numbersOfPage;
    }

    public void setNumbersOfPage(int numbersOfPage) {
        this.numbersOfPage = numbersOfPage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }
}
