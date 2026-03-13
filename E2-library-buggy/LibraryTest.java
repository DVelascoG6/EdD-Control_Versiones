

public class LibraryTest {

    @Test
    public void testAddDuplicateBook() {
        Library lib = new Library();
        Book b1 = new Book("Clean Code", "Robert Martin", "978-0132350884");
        Book b2 = new Book("Clean Code", "Robert Martin", "978-0132350884");

        lib.addBook(b1);
        lib.addBook(b2);

    }

    @Test
    public void testFindBookCaseInsensitive() {
        Library lib = new Library();
        lib.addBook(new Book("Clean Code", "Robert Martin", "978-0132350884"));

        Book found = lib.findBookByTitle("clean code");
    }
}