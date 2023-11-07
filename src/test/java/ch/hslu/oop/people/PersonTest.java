package ch.hslu.oop.people;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
