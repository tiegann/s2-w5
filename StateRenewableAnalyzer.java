import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Analyzer for U.S. state renewable electricity data using ArrayList + Scanner + File I/O.
 * CSV expected: Location,TotalGenTWh,PercentRenewable,RenewableGenTWh,PercentOfUSRenewable,CO2MtPerTWh
 */
public class StateRenewableAnalyzer {
    private ArrayList<StateRenewable> states;

    /**
     * Constructor initializes an empty ArrayList.
     */
    public StateRenewableAnalyzer() {
        states = new ArrayList<StateRenewable>();
    }

    /**
     * Reads state data from a CSV file and populates the ArrayList.
     * Assumes the first line is a header.
     * @param filename path to the CSV file
     * @throws IOException if the file is not found
     */
    public void readFromFile(String filename) throws IOException {
        //I had to make the Scanner this way -- I will explain why
        InputStream is = getClass().getResourceAsStream(filename);
        Scanner scanner = new Scanner(is);
    }

    /**
     * Display all states in the list.
     */
    public void displayAllStates() {
  
    }

    /**
     * Display states at or above a renewable percent threshold.
     * @param threshold minimum percent renewable to include
     * @return ArrayList of StateRenewable objects meeting the threshold
     */
    public ArrayList<StateRenewable> displayAbovePercent(double threshold) {
        return null;
    }

    /**
     * Find the state with the highest renewable percent.
     * @return StateRenewable with highest percent, or null if list is empty
     */
    public StateRenewable findHighestPercentRenewable() {
        return null;
    }

    /**
     * Find the state with the lowest renewable percent.
     * @return StateRenewable with lowest percent, or null if list is empty
     */
    public StateRenewable findLowestPercentRenewable() {
        return null;
    }

    /**
     * Calculate the average renewable percent across all states.
     * @return average percent, or 0 if list is empty
     */
    public double calculateAveragePercentRenewable() {
        return -1;
    }

    /**
     * Calculate total renewable generation (TWh) across all states.
     * @return sum of renewableGenTWh values
     */
    public double totalRenewableGenTWh() {
        return -1;
    }

    /**
     * Find the state with the highest renewable generation (TWh).
     * @return StateRenewable with highest renewableGenTWh, or null if list is empty
     */
    public StateRenewable findHighestRenewableGen() {
        return null;
    }

    /**
     * Display summary statistics.
     */
    public void displayStatistics() {

    }

    /**
     * Helper method to get total number of states (for testing).
     * @return size of the ArrayList
     */
    public int getTotalStates() {
        return states.size();
    }
}
