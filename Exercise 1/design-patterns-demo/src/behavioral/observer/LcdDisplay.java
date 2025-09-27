public class LcdDisplay implements DisplayDevice {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[LCD] Temperature: " + temperature + ", Humidity: " + humidity);
    }
}