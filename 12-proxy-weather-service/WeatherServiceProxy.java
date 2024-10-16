public class WeatherServiceProxy implements WeatherService {

    private final WeatherService realWeatherService;
    private final String apiKey;

    private static final String SECRET_API_KEY = "secret-api-key";

    public WeatherServiceProxy(WeatherService realWeatherService, String apiKey) {
        this.realWeatherService = realWeatherService;
        this.apiKey = apiKey;
    }

    @Override
    public String getWeather(String city) {
        if (this.apiKey == SECRET_API_KEY) {
            return realWeatherService.getWeather(city);
        }
        System.err.println("ERROR: Unauthorized. INVALID API KEY.");
        return null;
        // Or better yet throw a SecurityException
        // throw new SecurityException("ERROR: Unauthorized. INVALID API KEY.");
    }

}