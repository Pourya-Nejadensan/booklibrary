import java.util.Arrays;

public class Library {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String toString() {
        return "Library{" +
                "books= " + Arrays.toString(books) +
                '}';
    }
}
