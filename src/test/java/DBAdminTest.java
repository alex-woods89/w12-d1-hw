import org.junit.Before;
import org.junit.Test;
import techstaff.DBAdmin;

import static org.junit.Assert.assertEquals;

public class DBAdminTest {

    private DBAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DBAdmin("JH453423", "Sandra", 25000);
    }


    @Test
    public void canGetName(){
        assertEquals("Sandra", dbAdmin.getName());
    }

    @Test
    public void canGetNino(){
        assertEquals("JH453423", dbAdmin.getNino());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, dbAdmin.getSalary());
    }
}
