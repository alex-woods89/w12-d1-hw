import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sales", "JK476kk7", "Bill", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Bill", manager.getName());
    }

    @Test
    public void cangetDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(31000, manager.getSalary());
    }

}
