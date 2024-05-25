package BookSorter;

public class Book implements Comparable<Book>{
    private String name;
    private int numberOfPage;
    private String author;
    private String releaseYear;

    public Book (String name, int numberOfPage, String author, String releaseYear){
        this.name = name;
        this.numberOfPage = numberOfPage;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Book o1) {
        return this.name.compareTo(o1.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "BookSorter.Book{" +
                "name='" + name + '\'' +
                ", numberOfPage=" + numberOfPage +
                ", author='" + author + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                '}';
    }
}
