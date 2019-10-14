import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director(120000.00, "sales", "FR542312A", "Tony", 45000);
    }

    @Test
    public void canGetName(){
        assertEquals("Tony", director.getName());
    }

    @Test
    public void canBePaidDirectorBonus(){
     int newSalary = director.getSalary() + director.payBonus();
        assertEquals(45900, newSalary);
    }


}
