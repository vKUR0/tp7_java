public class Main {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        NotificationService notificationService = new EmailNotificationService();
        OrderProcessor orderProcessor = new OrderProcessor(notificationService);

        abstractBook physicalBook = new PhysicalBook("The Java Handbook", 29.99);
        abstractBook ebook = new EBook("Advanced Java Topics", 19.99);

        bookstore.addBook(physicalBook);
        bookstore.addBook(ebook);

        orderProcessor.processOrder(physicalBook, "user@example.com");

        Customer customer = new Customer();
        customer.borrowBook("The Java Handbook");
        customer.returnBook("The Java Handbook");
        customer.reviewBook("The Java Handbook", "Great book!");

        Admin admin = new Admin(bookstore);
        admin.addBookToStore(new AudioBook("Java Audio Guide", 15.99));
        admin.reviewBook("Advanced Java Topics", "Excellent depth!");
    }
}