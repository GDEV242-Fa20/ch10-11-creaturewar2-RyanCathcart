import java.util.ArrayList;

/**
 * A class that can simulate a battle between two armies.
 *
 * @author Ryan Cathcart
 * @version 2020.11.9
 */
public class BattleSim {
    private ArrayList<Creature> goodArmy, badArmy;
    private final int GOOD_ARMY_SIZE = 100, BAD_ARMY_SIZE = 40;
    private Randomizer r;

    /**
     * Constructor to initialize BattleSim
     */
    public BattleSim() {
        goodArmy = new ArrayList<Creature>();
        badArmy = new ArrayList<Creature>();
        r = new Randomizer();
    }
    
    /**
     * Main method that allows this program to be ran from terminal with command-line arguments
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        BattleSim sim = new BattleSim();
        sim.sim();
    }
    
    /**
     * Generates a good army of humans and elves, and a bad army of humans, cyberdemons, and balrogs
     */
    private void generateArmies() {
        // Generate good army
        while (goodArmy.size() < GOOD_ARMY_SIZE) {
            int choice = r.nextInt(2);
            if (choice == 1)
                goodArmy.add(new Human());
            else
                goodArmy.add(new Elf());
        }
        
        // Generate bad army
        while (badArmy.size() < BAD_ARMY_SIZE) {
            int choice = r.nextInt(25);
            if (choice <= 20)
                badArmy.add(new Human());
            else if (choice <= 24)
                badArmy.add(new CyberDemon());
            else
                badArmy.add(new Balrog());
        }
    }
    
    /**
     * Simulates the battle
     */
    public void sim() {
        System.out.println("Simulating Battle... ");
        generateArmies();
        //System.out.println("Armies, pre battle: ");
        //printArmies();
        
        while (!goodArmy.isEmpty() && !badArmy.isEmpty()) {
            while (goodArmy.get(0).isAlive() && badArmy.get(0).isAlive()) {
                int goodAttack = goodArmy.get(0).attack();
                int badAttack = badArmy.get(0).attack();
                // Optional print damage: 
                //System.out.println("Good " + goodArmy.get(0).getClass().getName() + " dealt " + goodAttack + " damage!" + 
                //                   "Bad " + badArmy.get(0).getClass().getName() + " dealt " + badAttack + " damage!\n");

                // Apply damage to both current combatants
                goodArmy.get(0).takeDamage(badAttack);
                badArmy.get(0).takeDamage(goodAttack);
            }
            
            if (goodArmy.get(0).isKnockedOut()) {
                // System.out.println("Good " + goodArmy.get(0).getClass().getName() + " knocked out!");
                goodArmy.remove(0);
            }
            
            if (badArmy.get(0).isKnockedOut()) {
                // System.out.println("Bad " + badArmy.get(0).getClass().getName() + " knocked out!");
                badArmy.remove(0);
            }
        }
        System.out.println();
        printResults();
    }
    
    /**
     * Print both the armies in their own single lines of text
     */
    private void printArmies() {
        System.out.print("Good Army (" + goodArmy.size() + "/" + GOOD_ARMY_SIZE + " remaining): ");
        for (Creature c : goodArmy) {
            System.out.print(c.getClass().getName() + ", ");
        }
        
        System.out.print("\nBad Army (" + badArmy.size() + "/" + BAD_ARMY_SIZE + " remaining): ");
        for (Creature c : badArmy) {
            System.out.print(c.getClass().getName() + ", ");
        }
        System.out.println("\n");
    }
    
    /**
     * Print the results of the simulation
     */
    private void printResults() {
        System.out.println("Battle Results: ");
        if (!goodArmy.isEmpty() && badArmy.isEmpty()) 
            System.out.println("Good Army wins!");
        else if (goodArmy.isEmpty() && !badArmy.isEmpty())
            System.out.println("Bad Army wins!");
        else
            System.out.println("Both teams died fighting.");
            
        System.out.println("\nArmies, post battle: ");
        printArmies();    
        System.out.println();
    }
}
