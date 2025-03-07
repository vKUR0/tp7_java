public class PhysicalBook extends Book {
    public PhysicalBook(String title, double price) {
        super(title, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Physical Book: " + title + " - Price: " + price);
    }
}