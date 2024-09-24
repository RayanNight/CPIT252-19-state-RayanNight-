package weather;

public class App {

  public static void main(String[] args) {
    CityWeather w = new YahooCityWeather();
    YahooCityWeather yw = new YahooCityWeather();
    // Using the City Geo Weather Adapter
    GeoWeather gw = new GeoWeatherAdapter(w);
    double tmp = gw.getTemp(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
    System.out.println(tmp);
  }
}
