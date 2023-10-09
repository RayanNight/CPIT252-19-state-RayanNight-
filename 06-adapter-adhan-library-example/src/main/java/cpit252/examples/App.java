package cpit252.examples;


import cpit252.examples.adhan.CityPrayerAdapter;
import cpit252.examples.adhan.GeoLocPrayerLibrary;
import cpit252.examples.adhan.PrayerByCity;
import cpit252.examples.adhan.PrayerByCoordinates;


public class App 
{
    public static void main( String[] args )
    {
        // Jeddah prayer times
        // Incompatible library
        PrayerByCoordinates prayerByCoordinates =  new GeoLocPrayerLibrary();
        PrayerByCity prayerByCity = new CityPrayerAdapter(prayerByCoordinates);

        System.out.println(prayerByCity.getPrayerTimes("Jeddah"));



    }
}
