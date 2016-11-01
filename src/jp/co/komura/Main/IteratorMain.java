package jp.co.komura.Main;

import jp.co.komura.Iterator.Book;
import jp.co.komura.Iterator.BookShelf;
import jp.co.komura.Iterator.IF.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }

}
