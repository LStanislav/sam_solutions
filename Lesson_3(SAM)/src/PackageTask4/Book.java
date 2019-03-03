package PackageTask4;

public class Book {
    Book(String booName, String author, int publicationYear){
        this.bookName = booName;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    private String author;
    private String bookName;
    private int publicationYear;

    public String getAuthor() { return author; }
    public String getBookName() { return bookName; }
    public int getPublicationYear() { return publicationYear; }

    public void setAuthor(String author) { this.author = author; }
    public void setBookName(String bookName) { this.bookName = bookName; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
}
