package davis.christin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void constructorTest01(){
        //Given
        String firstName = "Juliet";
        String lastName = "Capulet";
        Person person = new Person(firstName, lastName);

        //When
        String expected = "First Name: Juliet, Last Name: Capulet";
        String actual = person.toString();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetFirstNameTest01(){
        String firstName = "Juliet";
        String lastName = "Capulet";
        Person person = new Person(firstName, lastName);

        person.setFirstName("Romeo");
        String expected = "Romeo";
        String actual = person.getFirstName();

        assertEquals(expected, actual);
    }
    @Test
    public void getAndSetLastNameTest01(){
        String firstName = "Juliet";
        String lastName = "Capulet";
        Person person = new Person(firstName, lastName);

        person.setLastName("Montague");
        String expected = "Montague";
        String actual = person.getLastName();

        assertEquals(expected, actual);
    }
}
