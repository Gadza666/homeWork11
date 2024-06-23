import model.Author;
import model.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author author = new Author("Alexande", "Puskin");
        Author author2 = new Author("Lev", "Tolstoy");

        Book book = new Book("Evgeniy Onegin", author, 1830);
        Book book2 = new Book("War and Peace", author2, 1867);
        System.out.println(book.getYear());
        book.setYear(2024);
        System.out.println(book.getYear());

        System.out.println(book2);
    }
}