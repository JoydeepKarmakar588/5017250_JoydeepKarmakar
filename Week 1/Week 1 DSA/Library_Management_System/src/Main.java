public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book(2, "To Kill a Mockingbird", "Harper Lee"),
                new Book(3, "1984", "George Orwell"),
                new Book(4, "Pride and Prejudice", "Jane Austen")
        };

        // Linear Search
        Book foundBook = Linear_Search.SearchBooks(books, "1984");
        System.out.println(foundBook);

        // Binary Search
        Binary_Search.sortBooksByTitle(books); // Ensure the list is sorted before binary search
        foundBook = Binary_Search.SearchBooks(books, "1984");
        System.out.println(foundBook);
    }
}
