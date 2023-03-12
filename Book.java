package LibraryCatalog;

/**
 * The class Book, is a superclass. It has 3 methods.
 *
 * @param -  nameOfTheBook;
 * @param -  nrOfTheBook;
 */
public class Book {
    String nameOfTheBook;
    Integer nrOfTheBook;
    /**
     * The constructor of the class Book.
     *
     * @param - name ;
     * @param - nr ;
     *
     */
    public Book(String name, Integer nr) {
        this.nameOfTheBook = name;
        this.nrOfTheBook = nr;
    }
    /**
     * The method that set to null the values of the param. ;
     *
     * @param -  nameOfTheBook;
     * @param -  nrOfTheBook;
     *
     */
    public void deleteBook() {
        this.nameOfTheBook = null;
        this.nrOfTheBook = null;

    }
    /**
     * The method that override the string ;
     *
     * @param -  nameOfTheBook;
     * @param -  nrOfTheBook;
     *
     */
    @Override
    public String toString() {
        return "THE NAME IS " + nameOfTheBook + " IT HAS A NUMBER OF " + nrOfTheBook + " PAGES ";
    }
}

























