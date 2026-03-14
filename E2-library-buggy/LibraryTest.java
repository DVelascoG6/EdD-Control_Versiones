import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    // Bug #12: addBook() permite libros duplicados
    @Test
    public void testLibrosDuplicados() {
        Library library = new Library();
        Book b1 = new Book("El Señor de los Anillos", "J.R.R. Tolkien", "ISBN-001");
        Book b2 = new Book("El Señor de los Anillos", "J.R.R. Tolkien", "ISBN-001");
        library.addBook(b1);
        library.addBook(b2);
        // Con el bug hay 2 libros en vez de 1
        assertEquals(1, library.getAllBooks().size());
    }

    // Bug #13: findBookByTitle() es sensible a mayúsculas
    @Test
    public void testBusquedaMayusculas() {
        Library library = new Library();
        library.addBook(new Book("El Hobbit", "J.R.R. Tolkien", "ISBN-002"));
        // Con el bug devuelve null
        assertNotNull(library.findBookByTitle("el hobbit"));
    }

    // Bug #15: findAvailableBooks() siempre devuelve todos
    @Test
    public void testLibrosDisponibles() {
        Library library = new Library();
        Book b = new Book("Juego de Tronos", "George R.R. Martin", "ISBN-003");
        library.addBook(b);
        b.borrow();
        // Con el bug devuelve 1 en vez de 0
        assertEquals(0, library.findAvailableBooks().size());
    }

    // Bug #10: borrow() no valida si ya está prestado
    @Test
    public void testPrestarDosVeces() {
        Book b = new Book("Choque de Reyes", "George R.R. Martin", "ISBN-004");
        b.borrow();
        // Con el bug no lanza excepción
        assertThrows(IllegalStateException.class, () -> b.borrow());
    }

    // Bug #11: returnBook() no valida si ya estaba disponible
    @Test
    public void testDevolverLibroDisponible() {
        Book b = new Book("Las Dos Torres", "J.R.R. Tolkien", "ISBN-005");
        // Con el bug no lanza excepción aunque el libro ya está disponible
        assertThrows(IllegalStateException.class, () -> b.returnBook());
    }

    // Bug #16: falta método removeBook() en Library
    @Test
    public void testEliminarLibro() {
        Library library = new Library();
        library.addBook(new Book("El Retorno del Rey", "J.R.R. Tolkien", "ISBN-006"));
        // Con el bug este método no existe y el código no compila
        assertTrue(library.removeBook("ISBN-006"));
        assertEquals(0, library.getAllBooks().size());
    }
}