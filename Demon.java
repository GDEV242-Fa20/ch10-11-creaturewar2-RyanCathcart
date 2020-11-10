/**
 * Abstract class Demon - 
 * The demon is the main class from which all other battling demons derive.
 * It is the demon's job to calculate the
 * damage delivered based on the demon's strength (1 to str) 
 * 
 * @author Ryan Cathcart
 * @version 2020-11 v1.0
 */
public abstract class Demon extends Creature {  
    /**
     * Create a demon
     */
    public Demon() {
        super(); 
    }
    
    /**
     * Create a demon with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the demon started
     * with
     * @param str the strength of the demon, used to calculate damage
     * @param hp the health of the demon at the start of the simulation, and the current health levels during battle
     */
    public Demon(int str, int hp) {
       super(str, hp);
    }
    
    @Override
    /**
     * Allows a demon to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature.
     * 5% of the time, 50 is added to this value.
     */
    public int attack() {
        Randomizer r = new Randomizer();
        if (r.nextInt(20) == 1)
            return 50 + super.attack();
        else
            return super.attack();
    }
    
    // takeDamage(int) - not overridden, because Demons take all damage assigned to them
}
