/**
 * The Balrog class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the demon type [100/50]
 * Implements a maximum/minimum hitpoint total for the demon type [200/80]
 * 
 * @author Ryan Cathcart
 * @version 2020-11 v1.0
 */
public class Balrog extends Demon {
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of Balrog minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the balrog class is responsible for
     * returning a Balrog object with values in the appropriate range
     * 
     */
    public Balrog() {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min PLUS 1 is range of values THE PLUS 1 IS IMPORTANT SO YOU CAN MEET THE LOWER BOUNDS OF THE RANGE
        // range + (min MINUS 1) ensures that the values don't start at one. THE MINUS 1 IS NEEDED TO COMPENSATE FOR THE PREVIOUS ADDITION OF 1
        super(
            Randomizer.nextInt((MAX_BALROG_STR-MIN_BALROG_STR)+1)+(MIN_BALROG_STR-1), 
            Randomizer.nextInt((MAX_BALROG_HP-MIN_BALROG_HP)+1)+(MIN_BALROG_HP-1)
        );  
    }
    
    @Override
    /**
     * Allows a balrog to determine how much damage it is causing in this round of battle
     * @return a value equal to two distinct Demon attacks
     */
    public int attack() {
        return super.attack() + super.attack();
    }
    
    // takeDamage(int) - not overridden, because Balrogs take all damage assigned to them
}
