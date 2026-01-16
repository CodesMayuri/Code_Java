import java.util.Vector;

class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

public class CP35 {
    public static void main(String[] args) {

        Vector<Book> books = new Vector<>();

        // Adding book objects
        books.add(new Book(1, "2 States", "Chetan Bhagat", 350));
        books.add(new Book(2, "Java Complete Reference", "Herbert Schildt", 650));
        books.add(new Book(3, "Half Girlfriend", "Chetan Bhagat", 300));
        books.add(new Book(4, "Let Us C", "Yashwant Kanetkar", 450));

        // Count total books
        System.out.println("Total Books: " + books.size());

        // Search books by author
        String searchAuthor = "Chetan Bhagat";
        System.out.println("\nBooks by " + searchAuthor + ":");
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(searchAuthor)) {
                System.out.println(b.getTitle());
            }
        }

        // Calculate average price
        double totalPrice = 0;
        for (Book b : books) {
            totalPrice += b.getPrice();
        }
        double averagePrice = totalPrice / books.size();

        // Display books costing more than average price
        System.out.println("\nBooks above average price:");
        for (Book b : books) {
            if (b.getPrice() > averagePrice) {
                System.out.println(b.getTitle());
            }
        }
    }
}
