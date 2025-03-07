public abstract class Book {
    protected String title;
    protected double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public abstract void displayInfo();
}