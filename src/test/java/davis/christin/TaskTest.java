package davis.christin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void constructorTest01(){
        Person person = new Person("Teyonna", "Taylor");
        Task task = new Task("Clean Bathroom", person, Category.FAMILY);
        String expected = "Task: Clean Bathroom, Description: , Owner: Teyonna, Category: FAMILY, "
                +"Is Complete: false";
        String actual = task.toString();

        assertEquals(expected, actual);

    }
}
