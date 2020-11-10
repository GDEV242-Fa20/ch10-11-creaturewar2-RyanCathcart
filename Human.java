/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [30/10]
 * 
 * @author Ryan Cathcart
 * @version 2020-11 v1.0
 */
public class Human extends Creature {
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 30;
    private static final int MIN_HUMAN_HP = 10;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Human() {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min PLUS 1 is range of values THE PLUS 1 IS IMPORTANT SO YOU CAN MEET THE LOWER BOUNDS OF THE RANGE
        // range + (min MINUS 1) ensures that the values don't start at one. THE MINUS 1 IS NEEDED TO COMPENSATE FOR THE PREVIOUS ADDITION OF 1
        super(
            Randomizer.nextInt((MAX_HUMAN_STR-MIN_HUMAN_STR)+1)+(MIN_HUMAN_STR-1), 
            Randomizer.nextInt((MAX_HUMAN_HP-MIN_HUMAN_HP)+1)+(MIN_HUMAN_HP-1)
        );
          
    }
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them
}
