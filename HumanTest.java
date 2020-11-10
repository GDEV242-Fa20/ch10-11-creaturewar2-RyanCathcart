

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HumanTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HumanTest
{
    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
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
    public void testHuman()
    {
        Human h1 = new Human();
        assertTrue(h1.getHealth() >= 10 && h1.getHealth() <= 30);
        assertEquals(true, h1.isAlive());
        assertEquals(false, h1.isKnockedOut());
        h1.takeDamage(30);
        assertTrue(h1.getHealth() <= 0);
        assertEquals(false, h1.isAlive());
        assertEquals(true, h1.isKnockedOut());
        int dmg = h1.attack();
        assertTrue(dmg >= 1 && dmg <= 18);
    }
}
