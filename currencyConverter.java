import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main (String[] args) {
        // Define exchange rates
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);   // US Dollar
        exchangeRates.put("EUR", 0.85);  // Euro
        exchangeRates.put("GBP", 0.75);  // British Pound
        exchangeRates.put("JPY", 110.0); // Japanese Yen

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double amountUSD = scanner.nextDouble();

        // Perform currency conversion
        System.out.println("Converted amounts:");
        for (Map.Entry<String, Double> entry : exchangeRates.entrySet()) {
            String currencyCode = entry.getKey();
            double rate = entry.getValue();
            double convertedAmount = amountUSD * rate;
            System.out.printf("%s: %.2f %n", currencyCode, convertedAmount);
        }

        // Close the scanner
        scanner.close();
}
}

