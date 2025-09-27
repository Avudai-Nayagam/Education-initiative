public class Main {
    public static void main(String[] args) {
        // Observer Pattern Demo
        WeatherStation station = new WeatherStation();
        station.addDevice(new LcdDisplay());
        station.setMeasurements(23.5f, 65f);

        // Strategy Pattern Demo
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100.0);

        // Factory Pattern Demo
        Notification notification = NotificationFactory.createNotification("email");
        notification.send("user@example.com", "Your order is shipped!");

        // Singleton Logger Demo
        AppLogger logger = AppLogger.getInstance();
        logger.log("Application started.");

        // Adapter Pattern Demo
        Printer printer = new PrinterAdapter(new LegacyPrinter());
        printer.print("Hello World!");

        // Decorator Pattern Demo
        Coffee coffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(coffee.description() + ": $" + coffee.cost());
    }
}