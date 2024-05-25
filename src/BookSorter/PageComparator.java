package BookSorter;

import java.util.Comparator;

public class PageComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getNumberOfPage() == o2.getNumberOfPage()) return o1.compareTo(o2);

        return o1.getNumberOfPage() - o2.getNumberOfPage();
    }
}
