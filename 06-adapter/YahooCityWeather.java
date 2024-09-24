package weather;

public class YahooCityWeather implements CityWeather {

  @Override
  public double getTemp(String city) {
    // hitting the Yahoo api
    return 40.0;
  }
}
