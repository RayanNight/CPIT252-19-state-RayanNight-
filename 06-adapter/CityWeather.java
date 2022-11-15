package weather;

public class CityWeather implements Weather {

  @Override
  public double getTemp(String city){
    // hitting an api
    return 40.0;
  }
}
