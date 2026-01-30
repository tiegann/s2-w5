/**
 * Activity 1: Air Quality Analyzer (Real Data)
 * 
 * In this activity, you will work with a real dataset of Air Quality Index
 * (AQI)
 * readings for Delhi, India, during November 2024. This location and month are
 * known for having extreme fluctuations in air quality.
 * 
 * AQI Categories:
 * 0-50: Good
 * 51-100: Satisfactory
 * 101-200: Moderate
 * 201-300: Poor
 * 301-400: Very Poor
 * 401-500: Severe
 * 501+: Hazardous
 * 
 * Your task:
 * 1. Calculate the average AQI for the period.
 * 2. Find the maximum AQI (the worst pollution day).
 * 3. Count how many days were "Severe" or "Hazardous" (AQI > 400).
 */
public class AQIAnalyzer {

    public static void main(String[] args) {
        // Daily AQI readings for Delhi, Nov 2024 (selected days with high variance)
        // Values: 387, 358, 409, 481, 700, 488, 373, 290, 310, 450, 520, 610, 340, 380
        int[] aqiData = { 387, 358, 409, 481, 700, 488, 373, 290, 310, 450, 520, 610, 340, 380 };

        // TODO 1: Calculate the average AQI
        int sum = 0;
        // Your code here

        // TODO 2: Find the maximum AQI
        int max = aqiData[0];
        // Your code here

        // TODO 3: Count "Severe" or "Hazardous" days (AQI > 400)
        int criticalDays = 0;
        // Your code here

        // Print results (uncomment when ready)
        // System.out.println("Average AQI: " + (sum / aqiData.length));
        // System.out.println("Max AQI: " + max);
        // System.out.println("Severe/Hazardous Days: " + criticalDays);
    }
}
