public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        // Simulate payment
        System.out.println("Paid " + amount + " using Credit Card.");
        return true;
    }
}