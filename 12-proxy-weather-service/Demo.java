public class Demo {
    public static void main(String[] args) {
        WeatherService realWeatherService = new RealWeatherService();

        // Valid Proxy
        WeatherService proxyWeatherService = new WeatherServiceProxy(realWeatherService, "secret-api-key");
        String weatherInJeddah = proxyWeatherService.getWeather("Jeddah");
        System.out.println(weatherInJeddah);

        // Invalid Proxy
        WeatherService invalidProxyWeatherService = new WeatherServiceProxy(realWeatherService, "abcdWrong");
        String weatherForecasts = invalidProxyWeatherService.getWeather("Jeddah");
        System.out.println(weatherForecasts);
    }
}