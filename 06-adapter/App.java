package weather;

public class App{

  public static void main(String[]args){
    // Using the City weather interface (without the adapter)
    Weather w = new CityWeather();
    //double tmp = w.getTemp(args[0]);
    //System.out.println(tmp);
    // Using the City Geo Weather Adapter
    GeoWeather gw = new GeoWeatherAdapter(w);
    double tmp = gw.getTemp(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
    System.out.println(tmp);
  }
}
