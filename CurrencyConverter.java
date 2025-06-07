import java.util.*;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Example rates: 1 USD to others as per 8th June 2025
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.88);
        exchangeRates.put("GBP", 0.74);
        exchangeRates.put("JPY", 144.85);
        exchangeRates.put("INR", 85.76);
        // Add more currencies as needed
    }

    public static double convert(String from, String to, double amount) {
        if (!exchangeRates.containsKey(from) || !exchangeRates.containsKey(to)) {
            throw new IllegalArgumentException("Unsupported currency.");
        }
        double inUSD = amount / exchangeRates.get(from);
        return inUSD * exchangeRates.get(to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available currencies: " + exchangeRates.keySet());
        System.out.print("Enter source currency (e.g., USD): ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter target currency (e.g., EUR): ");
        String to = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        try {
            double result = convert(from, to, amount);
            System.out.printf("%.2f %s = %.2f %s%n", amount, from, result, to);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}