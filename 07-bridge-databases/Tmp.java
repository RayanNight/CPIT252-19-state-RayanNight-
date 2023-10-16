
abstract class Weather{

}

class YahooWeather implements Weather{

}

// class OpenWeatherMeteo implements Weather{

// }

public class Temp {

    Weather owm = new YahooWeather(); //new OpenWeatherMeteo();


    void getWeather(Weather owm){

    }

    void getWindInfo(Weather owm){

    }
    
}


public int add(int x, int y){
    return x * y;
}

// test
int result = add(2,2);
if (result == 4){
    System.out.println("We're good!");
}