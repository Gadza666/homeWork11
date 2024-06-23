package model;

import java.util.Objects;

public class Author {
    private String firstName;
    private  String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    public String toString() {
        return firstName+ " " +lastName;
    }
}
