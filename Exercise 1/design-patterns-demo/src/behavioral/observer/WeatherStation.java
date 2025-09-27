import java.util.List;
import java.util.ArrayList;

public class WeatherStation {
    private List<DisplayDevice> devices = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void addDevice(DisplayDevice device) {
        devices.add(device);
    }

    public void removeDevice(DisplayDevice device) {
        devices.remove(device);
    }

    public void setMeasurements(float temp, float hum) {
        temperature = temp;
        humidity = hum;
        notifyDevices();
    }

    private void notifyDevices() {
        for (DisplayDevice device : devices) {
            device.update(temperature, humidity);
        }
    }
}