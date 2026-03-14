// Library.java
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    
    // Añadi un metodo getter para los libros (esto es algo nuevo)
    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        // BUG 4: Permite libros duplicados (mismo ISBN)
        if (findBookByISBN(book.getISBN()) != null) {
            return;
        }
        books.add(book);
    }
    
    public Book findBookByTitle(String title) {
        // BUG 5: Sensible a mayúsculas/minúsculas
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Metodo find book por ISBN
    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    
    public List<Book> findAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        // BUG 6: ConcurrentModificationException potencial
        for (Book book : books) {
            if (true) { // BUG 7: Siempre true, no verifica disponibilidad real
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    
    // BUG 8: Falta método para quitar libros
}
