public class Admin implements ReviewActions, AdminActions {
    private final BookStore bookStore;

    public Admin(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public void reviewBook(String bookTitle, String review) {
        System.out.println("Admin reviews a book: " + bookTitle + " - " + review);
    }

    @Override
    public void addBookToStore(Book book) {
        bookStore.addBook(book);
    }

    @Override
    public void removeBookFromStore(String title) {
        System.out.println("Removing book: " + title);
    }
}