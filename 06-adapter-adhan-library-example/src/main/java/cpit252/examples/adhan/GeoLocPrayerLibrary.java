package cpit252.examples.adhan;

import com.batoulapps.adhan.CalculationMethod;
import com.batoulapps.adhan.CalculationParameters;
import com.batoulapps.adhan.Coordinates;
import com.batoulapps.adhan.PrayerTimes;
import com.batoulapps.adhan.data.DateComponents;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class GeoLocPrayerLibrary implements PrayerByCoordinates {
    @Override
    public String getPrayerTimes(double lat, double lon) {
        Coordinates coordinates = new Coordinates(lat, lon);
        DateComponents date = DateComponents.from(new Date());
        CalculationParameters params =
                CalculationMethod.UMM_AL_QURA.getParameters();

        PrayerTimes prayerTimes = new PrayerTimes(coordinates, date, params);

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Riyadh"));

        return new StringBuilder("Prayer Times")
                .append("\nFajr: " + formatter.format(prayerTimes.fajr))
                .append("\nDhur: " + formatter.format(prayerTimes.dhuhr))
                .append("\nAsr: " + formatter.format(prayerTimes.asr))
                .append("\nMaghrib: " + formatter.format(prayerTimes.maghrib))
                .append("\nIsha: " + formatter.format(prayerTimes.isha))
                .toString();
    }
}
