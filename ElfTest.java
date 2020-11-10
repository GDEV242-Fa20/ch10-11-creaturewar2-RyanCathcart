

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfTest
{
    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
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
    public void testElf()
    {
        Elf elf1 = new Elf();
        assertTrue(elf1.getHealth() >= 8 && elf1.getHealth() <= 25);
        assertEquals(true, elf1.isAlive());
        assertEquals(false, elf1.isKnockedOut());
        elf1.takeDamage(25);
        assertTrue(elf1.getHealth() <= 0);
        assertEquals(false, elf1.isAlive());
        assertEquals(true, elf1.isKnockedOut());
        int dmg = elf1.attack();
        assertTrue(dmg >= 1 && dmg <= 36);
    }
}

