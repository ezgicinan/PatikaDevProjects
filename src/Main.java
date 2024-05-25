import BookSorter.Book;
import BookSorter.PageComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main { public static void main(String [] args){
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(new Book("The Universe in Your Hand: A Journey Through Space, Time, and Beyond",
                400,"Christophe Galfard","2015"));
        bookSet.add(new Book("Ince Memed 1", 440, "Yasar Kemal", "1955"));
        bookSet.add(new Book("Harry Potter and the Chamber of Secrets", 374,
                "J. K. Rowling", "1998"));
        bookSet.add(new Book("The Mother", 384, "Maxim Gorky", "1906"));
        bookSet.add(new Book("Efsuncu Baba", 96, "Hüseyin Rahmi Gürpınar",
                "1924"));

        System.out.println("BookSorter.Book Set Before Sort:");
        bookSet.forEach(book -> System.out.println(book.toString()));

        TreeSet<Book> bookTreeSet = new TreeSet<Book>(bookSet);
        System.out.println();

        System.out.println("-----------------------\nBookSorter.Book Set After Sort By Name:");
        bookTreeSet.forEach(book -> System.out.println(book.toString()));
        System.out.println();

        TreeSet<Book> set = new TreeSet<>(new PageComparator());
        set.add(new Book("The Universe in Your Hand: A Journey Through Space, Time, and Beyond",
                400,"Christophe Galfard","2015"));
        set.add(new Book("Ince Memed 1", 440, "Yasar Kemal", "1955"));
        set.add(new Book("Harry Potter and the Chamber of Secrets", 374,
                "J. K. Rowling", "1998"));
        set.add(new Book("The Mother", 384, "Maxim Gorky", "1906"));
        set.add(new Book("Efsuncu Baba", 96, "Hüseyin Rahmi Gürpınar",
                "1924"));
        set.add(new Book("Ayten", 96, "Burhan Cahit Morkaya", "1927"));

        System.out.println();
        System.out.println("-----------------------\nBookSorter.Book Set After Sort By Page Number:");
        set.forEach(book -> System.out.println(book.toString()));




    }
}
