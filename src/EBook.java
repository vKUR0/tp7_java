public class EBook extends Book {
    public EBook(String title, double price) {
        super(title, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + title + " - Price: " + price);
    }
}