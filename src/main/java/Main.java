public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book[] books = {
                new Book("1984","George Orwell", "978-0451524935"),
                new Book("To Kill a Mockingbird", "Harper Lee", "978-0060935467"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565")
        };
        myLibrary.setBooks(books);
        System.out.println(myLibrary);
    }
}
