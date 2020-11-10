/**
 * The CyberDemon class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the demon type [40/20]
 * Implements a maximum/minimum hitpoint total for the demon type [100/25]
 * 
 * @author Ryan Cathcart
 * @version 2020-11 v1.0
 */
public class CyberDemon extends Demon {
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;

    /**
     * Constructor for objects of class CyberDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of CyberDemon minimum and maximum values
     * 
     * The instantiating class asks for a CyberDemon and the cyberdemon class is responsible for
     * returning a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon() {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min PLUS 1 is range of values THE PLUS 1 IS IMPORTANT SO YOU CAN MEET THE LOWER BOUNDS OF THE RANGE
        // range + (min MINUS 1) ensures that the values don't start at one. THE MINUS 1 IS NEEDED TO COMPENSATE FOR THE PREVIOUS ADDITION OF 1
        super(
            Randomizer.nextInt((MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+1)+(MIN_CYBERDEMON_STR-1), 
            Randomizer.nextInt((MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+1)+(MIN_CYBERDEMON_HP-1)
        );  
    }
    
    // attack() - not overridden because CyberDemons generate basic damage
    // takeDamage(int) - not overridden, because CyberDemons take all damage assigned to them
}
