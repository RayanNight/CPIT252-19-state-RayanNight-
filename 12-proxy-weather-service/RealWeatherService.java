import java.lang.Thread;
import java.lang.InterruptedException;

public class RealWeatherService implements WeatherService {
    @Override
    public String getWeather(String city) {
        // Hitting an API and getting the weather forecast for the given city
        simulateNetworkLatency();
        return "The weather for " + city + " is: high: " + 42;
    }

    // Simulate network latency
    private void simulateNetworkLatency() {
        try {
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}