package ch.hslu.oop.people;

import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int firstNameCompare = person1.getFirstName().compareTo(person2.getFirstName());
        if (firstNameCompare == 0) return person1.getLastName().compareTo(person2.getLastName());
        return firstNameCompare;
    }
}
