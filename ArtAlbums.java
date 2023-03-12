package LibraryCatalog;

/**
 * The class ArtAlbum, is a subclass of the class Book. It has 3 method.
 *
 * @param - paperQuality;
 * @author : Silvia Padurean
 */

public class ArtAlbums extends Book {
    Integer paperQuality;

    /**
     * The constructor of the class ArtAlbum.
     *
     * @param - name ;
     * @param - nr ;
     * @param - paperQuality;
     */
    public ArtAlbums(String name, Integer nr, Integer paperQuality) {
        super(name, nr);
        this.paperQuality = paperQuality;
    }

    /**
     * The method that override the string ;
     *
     * @param - paperQuality;
     */
    @Override
    public String toString() {
        return super.toString() + " AND HAS THE QUALITY " + paperQuality;
    }

    /**
     * The method that override and set to null the values of the param.
     *
     * @param - nameOfTheBook;
     * @param - nrOfTheBook;
     * @param - paperQuality;
     */
    @Override
    public void deleteBook() {
        this.nameOfTheBook = null;
        this.nrOfTheBook = null;
        paperQuality = null;
    }
}
