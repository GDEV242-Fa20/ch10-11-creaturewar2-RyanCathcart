

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CyberDemonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CyberDemonTest
{
    /**
     * Default constructor for test class CyberDemonTest
     */
    public CyberDemonTest()
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
    public void testCyberDemon()
    {
        CyberDemon c1 = new CyberDemon();
        assertTrue(c1.getHealth() >= 25 && c1.getHealth() <= 100);
        assertEquals(true, c1.isAlive());
        assertEquals(false, c1.isKnockedOut());
        c1.takeDamage(100);
        assertTrue(c1.getHealth() <= 0);
        assertEquals(false, c1.isAlive());
        assertEquals(true, c1.isKnockedOut());
        int dmg = c1.attack();
        assertTrue(dmg >= 1 && dmg <= 90);
    }
}
