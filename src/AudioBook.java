public class AudioBook extends abstractBook {
    public AudioBook(String title, double price) {
        super(title, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book: " + title + " - Price: " + price);
    }
}
