import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director(12000.99, "sales", "FR542312A", "Tony", 45000);
    }

    @Test
    public void canGetName(){
        assertEquals("Tony", director.getName());
    }

    @Test
    public void canGetnino(){
        assertEquals("FR542312A", director.getNino());
    }

    @Test
    public void canGetbudget(){
        assertEquals(12000.99, director.getBudget(), 0.1);
    }

    @Test
    public void canGetDept(){
        assertEquals("sales", director.getDeptName());
    }

    @Test
    public void canBePaidDirectorBonus(){
     int newSalary = director.getSalary() + director.payBonus();
        assertEquals(45900, newSalary);
    }


}
