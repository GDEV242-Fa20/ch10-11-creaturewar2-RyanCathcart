

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BalrogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BalrogTest
{
    /**
     * Default constructor for test class BalrogTest
     */
    public BalrogTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testBalrog()
    {
        Balrog b1 = new Balrog();
        assertTrue(b1.getHealth() >= 80 && b1.getHealth() <= 200);
        assertEquals(true, b1.isAlive());
        assertEquals(false, b1.isKnockedOut());
        b1.takeDamage(200);
        assertTrue(b1.getHealth() <= 0);
        assertEquals(false, b1.isAlive());
        assertEquals(true, b1.isKnockedOut());
        int dmg = b1.attack();
        assertTrue(dmg >= 2 && dmg <= 300);
    }
}
