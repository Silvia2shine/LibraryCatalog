package LibraryCatalog;

/**
 * The class Novels, is a subclass of the class Book. It has 3 method.
 *
 * @author : Silvia Padurean
 * @param - type;
 */
public class Novels extends Book {
    String type;
    /**
     * The constructor of the class Novels.
     *
     * @param - name ;
     * @param - nr ;
     * @param - type;
     *
     */
    public Novels(String name, Integer nr, String type) {
        super(name, nr);

        this.type = type;
    }
    /**
     * The method that override and set to null the values of the param. ;
     *
     * @param -  nameOfTheBook;
     * @param -  nrOfTheBook;
     * @param -  type;
     *
     */
    @Override
    public void deleteBook() {
        this.nameOfTheBook = null;
        this.nrOfTheBook = null;
        type = null;
    }
    /**
     * The method that override the string ;
     *
     * @param - type;
     *
     */
    @Override
    public String toString() {
        return super.toString() + " AND HAS THE TYPE: " + type;
    }
}
