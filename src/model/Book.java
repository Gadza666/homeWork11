package model;

public class Book {

    private String title;
    private int year;
    private Author author;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear () {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return title.equals(otherBook.title) &&
                author.equals(otherBook.author) &&
                year == otherBook.year;
    }

    public int hashCode() {
        return title.hashCode() + author.hashCode() + year;
    }

    public String toString() {
            return title + " " + author.toString() + " " + year;
        }
    }

