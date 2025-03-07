import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.title);
    }

    public List<Book> getBooks() {
        return books;
    }
}