import org.junit.Before;
import org.junit.Test;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("AB123456K", "Barbara", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Barbara", developer.getName());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void canGetNino(){
        assertEquals("AB123456K", developer.getNino());
    }

    @Test
    public void cantBePaidANegativeRaiseSalary(){
        developer.raiseSalary(-5000);
        assertNotEquals(20000, developer.getSalary());
    }

    @Test
    public void canNotChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Barbara", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("Simon");
        assertEquals("Simon", developer.getName());
    }

}
