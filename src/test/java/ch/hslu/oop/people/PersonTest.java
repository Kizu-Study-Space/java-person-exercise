package ch.hslu.oop.people;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import nl.jqno.equalsverifier.*;

public class PersonTest {

    @Test
    public void testGetId() {
        Person person = new Person(84943829, "Gratella", "Fischer");
        assertEquals(84943829, person.getId());
    }

    @Test
    public void testGetFirstName() {
        Person person = new Person(84943829, "Gratella", "Fischer");
        assertEquals("Gratella", person.getFirstName());
    }

    @Test
    public void testGetLastName() {
        Person person = new Person(84943829, "Gratella", "Fischer");
        assertEquals("Fischer", person.getLastName());
    }

    @Test
    public void testsetFirstName() {
        Person person = new Person(84943829, "Gratella", "Fischer");
        person.setFirstName("Greta");
        assertEquals("Greta",person.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Person person = new Person(84943829, "Gratella", "Fischer");
        person.setLastName("Ulrich");
        assertEquals("Ulrich",person.getLastName());
    }

    @Test
    public void testToString() {
        Person person = new Person(84943829, "Gratella", "Fischer");
        assertEquals("Person{id=84943829, firstName='Gratella', lastName='Fischer'}", person.toString());
    }

    @Test
    public void testEquals() {
        EqualsVerifier.forClass(Person.class).withOnlyTheseFields("id").verify();
    }

    @Test
    public void testCompareTo() {
        Person person1 = new Person(84943829, "Gratella", "Fischer");
        Person person2 = new Person(84943829, "Gratella", "Fischer");
        Person person3 = new Person(637, "Greta", "Ulrich");
        assertEquals(0, person1.compareTo(person2));
        assertEquals(1, person1.compareTo(person3));
        assertEquals(-1, person3.compareTo(person1));
    }
}
