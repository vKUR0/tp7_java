public class PhysicalBook extends abstractBook {
    public PhysicalBook(String title, double price) {
        super(title, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Physical Book: " + title + " - Price: " + price);
    }
}