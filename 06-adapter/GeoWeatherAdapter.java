package weather;

public class GeoWeatherAdapter implements GeoWeather {

  private CityWeather w;

  public GeoWeatherAdapter(CityWeather w) {
    this.w = w;
  }

  @Override
  public double getTemp(double lat, double lng) {
    String city = getCity(lat, lng);
    return w.getTemp(city);
  }

  private String getCity(double lat, double lng) {
    // Hitting Google Maps API to get city from lat & lng
    return "Jeddah";
  }
}
