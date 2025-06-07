# CurrencyConverter

A simple Java console application that allows users to convert amounts between different currencies using hardcoded exchange rates.

## Features

- Convert between USD, EUR, GBP, JPY, and INR.
- User-friendly command-line interface.
- Input validation for supported currencies.

## Usage

1. **Compile the program:**
   ```sh
   javac CurrencyConverter.java
   ```

2. **Run the program:**
   ```sh
   java CurrencyConverter
   ```

3. **Follow the prompts:**
   - Enter the source currency code (e.g., USD).
   - Enter the target currency code (e.g., INR).
   - Enter the amount to convert.

## Example

```
Available currencies: [USD, EUR, GBP, JPY, INR]
Enter source currency (e.g., USD): USD
Enter target currency (e.g., INR): INR
Enter amount: 10
10.00 USD = 830.00 INR
```

## Notes

- Exchange rates are hardcoded for demonstration purposes.
- For real-time rates, integrate with a currency exchange API.

---