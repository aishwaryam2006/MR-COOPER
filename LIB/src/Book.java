


public class Book {
    private int isbn;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    private int quantity;
    

    public Book(String title) {
        this.isbn=isbn;
        this.title = title;
        this.author=author;
        this.genre=genre;
        this.isAvailable = true;
        this.quantity=quantity;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }
}
