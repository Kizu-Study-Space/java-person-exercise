package ch.hslu.oop.people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonFirstNameComparatorTest {
    @Test
    public void testCompare() {
        Person person1 = new Person(84943829, "Gratella", "Fischer");
        Person person2 = new Person(84943829, "Gratella", "Fischer");
        Person person3 = new Person(84943829, "Luna", "Fischer");
        Person person4 = new Person(637, "Gratella", "Ulrich");
        assertEquals(0, new PersonFirstNameComparator().compare(person1, person2));
        assertTrue(new PersonFirstNameComparator().compare(person1, person3) < 0);
        assertTrue(new PersonFirstNameComparator().compare(person3, person1) > 0);
        assertTrue( new PersonFirstNameComparator().compare(person1, person4) < 0);
        assertTrue(new PersonFirstNameComparator().compare(person4, person1) > 0);
    }
}
