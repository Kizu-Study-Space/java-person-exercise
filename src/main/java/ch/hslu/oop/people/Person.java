package ch.hslu.oop.people;

public final class Person {
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
        return "Person{" +
                "id=" + id + ", " +
                "firstName='" + firstName + "', " +
                "lastName='" + lastName + "'" +
                '}';
    }
}
