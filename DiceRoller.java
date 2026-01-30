import java.util.Random;

/**
 * Activity 2: Dice Roller (Student Generated)
 * 
 * In this activity, you will generate your own data by simulating
 * 100 rolls of a 6-sided die.
 * 
 * Your task:
 * 1. Create an array of 100 integers.
 * 2. Fill the array with random numbers between 1 and 6.
 * 3. Count how many times each number (1-6) appears (the frequency).
 * 4. Print a simple histogram or frequency list.
 */
public class DiceRoller {

    public static void main(String[] args) {
        int numRolls = 100;
        Random rand = new Random();

        // TODO 1: Create an array of size 100
        int[] rolls = new int[numRolls];

        // TODO 2: Fill the array with random numbers 1-6
        for (int i = 0; i < rolls.length; i++) {
            // Your code here: rolls[i] = ...
        }

        // TODO 3: Count frequencies
        // Hint: You could use another array of size 7 to store counts for 1-6
        int[] frequencies = new int[7];

        // Loop through rolls and update frequencies
        // Your code here

        // TODO 4: Print results
        System.out.println("Roll Frequencies:");
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ": " + frequencies[i]);
        }
    }
}
