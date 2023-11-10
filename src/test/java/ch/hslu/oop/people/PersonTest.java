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

        Person person1 = new Person(838394, "Lisa", "Meier");
        Person person2 = new Person(838394, "Juli", "Wankdorfer");
        Person person3 = new Person(738283, "Lisa", "Meier");
        
        assertEquals(true, person1.equals(person2));
        assertEquals(false, person1.equals(person3));
    }
}
