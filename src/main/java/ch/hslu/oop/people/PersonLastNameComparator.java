package ch.hslu.oop.people;

import java.util.Comparator;

public class PersonLastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int comparedLastName = person1.getLastName().compareTo(person2.getLastName());
        if (comparedLastName == 0) return person1.getFirstName().compareTo(person2.getFirstName());
        return comparedLastName;
    }
}
