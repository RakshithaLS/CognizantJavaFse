
public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        // Base case: If no years left, return the present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: Calculate future value with one year reduced
        return calculateFutureValue(presentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial investment
        double rate = 0.05; // Growth rate (5%)
        int years = 10; // Number of years

        double futureValue = calculateFutureValue(presentValue, rate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
