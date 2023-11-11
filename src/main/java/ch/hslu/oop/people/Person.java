package ch.hslu.oop.people;

import java.util.Objects;

public final class Person implements Comparable<Person>{
    private final long id;
    private String firstName;
    private String lastName;

    public Person(final long id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", " + "firstName='" + firstName + "', " + "lastName='" + lastName + "'" + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object instanceof Person person) {
            return this.id == person.id;
        }
        return false;
    }

    @Override
    public int compareTo(Person o) {
        return Long.compare(this.id, o.id);
    }
}
