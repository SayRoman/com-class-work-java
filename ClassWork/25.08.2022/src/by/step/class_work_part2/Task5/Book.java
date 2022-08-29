package by.step.class_work_part2.Task5;

public class Book {

    private String nameBook;
    private String fioAuthor;
    private String yearProduction;
    private String nameCompany;
    private String genre;
    private int countPage;


    public Book(String nameBook, String fioAuthor, String yearProduction, String nameCompany, String genre, int countPage) {
        this.nameBook = nameBook;
        this.fioAuthor = fioAuthor;
        this.yearProduction = yearProduction;
        this.nameCompany = nameCompany;
        this.genre = genre;
        this.countPage = countPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", fioAuthor='" + fioAuthor + '\'' +
                ", yearProduction='" + yearProduction + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", genre='" + genre + '\'' +
                ", countPage=" + countPage +
                '}';
    }
}
