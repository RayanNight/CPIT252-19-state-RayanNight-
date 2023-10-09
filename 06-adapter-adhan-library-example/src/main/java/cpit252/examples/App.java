package cpit252.examples;

import com.batoulapps.adhan.*;
import com.batoulapps.adhan.data.DateComponents;
import cpit252.examples.adhan.CityPrayerAdapter;
import cpit252.examples.adhan.GeoLocPrayer;
import cpit252.examples.adhan.PrayerByCity;
import cpit252.examples.adhan.PrayerByCoordinates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class App 
{
    public static void main( String[] args )
    {
        // Jeddah prayer times
        // Incompatible library
        PrayerByCoordinates prayerByCoordinates =  new GeoLocPrayer();
        PrayerByCity prayerByCity = new CityPrayerAdapter(prayerByCoordinates);

        System.out.println(prayerByCity.getPrayerTimes("Jeddah"));



    }
}
