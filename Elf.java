/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Ryan Cathcart
 * @version 2020-11 v1.0
 */
public class Elf extends Creature {
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the elf class is responsible for
     * returning a Elf object with values in the appropriate range
     * 
     */
    public Elf() {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min PLUS 1 is range of values THE PLUS 1 IS IMPORTANT SO YOU CAN MEET THE LOWER BOUNDS OF THE RANGE
        // range + (min MINUS 1) ensures that the values don't start at one. THE MINUS 1 IS NEEDED TO COMPENSATE FOR THE PREVIOUS ADDITION OF 1
        super(
            Randomizer.nextInt((MAX_ELF_STR-MIN_ELF_STR)+1)+(MIN_ELF_STR-1), 
            Randomizer.nextInt((MAX_ELF_HP-MIN_ELF_HP)+1)+(MIN_ELF_HP-1)
        );
          
    }
    
    @Override
    /**
     * Allows an elf to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature.
     * 10% of the time this value is multiplied by 2.
     */
    public int attack() {
        Randomizer r = new Randomizer();
        if (r.nextInt(10) == 1)
            return 2 * super.attack();
        else
            return super.attack();
    }
    
    // takeDamage(int) - not overridden, because Elves take all damage assigned to them
}
