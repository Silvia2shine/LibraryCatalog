// Homework 2: create a small application that mimics a library catalog
package LibraryCatalog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * The class MainBooks. It contains the main method.
 *
 * @author : Silvia Padurean
 */
public class MainBooks {
    /**
     * The main method.
     *
     * @param - bookList - a LinkedList in wich are store the books;
     * @param - Book1 - an object of the class Novels;
     * @param - Book2 - an object of the class ArtAlbum;
     * @param - Book3 - an object of the class ArtAlbum;
     */
    public static void main(String[] args) {

        LinkedList<Book> bookList = new LinkedList<>();

        Book book1 = new Novels("Caragiale", 23, "poetry");
        Book book2 = new ArtAlbums("Eminescu", 23, 3);
        Book book3 = new ArtAlbums("Creanga", 93, 1);

        bookList.add(0, book1);
        bookList.add(1, book2);
        bookList.add(2, book3);

        System.out.println("The books are: ");
        for (int i = 0; (i < bookList.size()); i++)
            System.out.println(bookList.get(i));

        System.out.println();

        System.out.println("WE WILL DELETE THE BOOK FROM THE LIBRARY " + book1.nameOfTheBook);

        book1.deleteBook();
        System.out.println(book1);
    }
}


