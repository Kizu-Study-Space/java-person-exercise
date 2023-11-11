package ch.hslu.oop.people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonLastNameComparatorTest {
    @Test
    public void testCompare() {
        Person person1 = new Person(84943829, "Gratella", "Fischer");
        Person person2 = new Person(234234, "Gratella", "Fischer");
        Person person3 = new Person(847, "Luna", "Fischer");
        Person person4 = new Person(637, "Greta", "Ulrich");
        assertEquals(0, new PersonLastNameComparator().compare(person1, person2));
        assertTrue(new PersonLastNameComparator().compare(person1, person3) < 0);
        assertTrue(new PersonLastNameComparator().compare(person3, person1) > 0);
        assertTrue( new PersonLastNameComparator().compare(person1, person4) < 0);
        assertTrue(new PersonLastNameComparator().compare(person4, person1) > 0);
    }
}
