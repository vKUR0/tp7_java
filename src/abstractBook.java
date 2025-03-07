public abstract class abstractBook {
    protected String title;
    protected double price;

    public abstractBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public abstract void displayInfo();
}