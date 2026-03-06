import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddDuplicateBook() {
        Library lib = new Library();

        Book b1 = new Book("Titulo", "Autor", "ISBN-123");
        Book b2 = new Book("Titulo", "Autor", "ISBN-123");

        lib.addBook(b1);
        lib.addBook(b2);

        // Aquí comprobamos el tamaño
        assertEquals(1, lib.getBooks().size());
    }
}
