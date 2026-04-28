


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
    }

    public void removeBook(String title)
    {
        books.remove(new Book(title));
    }

   

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed: " + title);
                    return;
                } 
               
                else {
                    System.out.println("Book is already borrowed: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned: " + title);
                    return;
                } else {
                    System.out.println("Book was not borrowed: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    
}
