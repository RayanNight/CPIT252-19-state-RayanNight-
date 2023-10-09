package cpit252.examples.adhan;

public class CityPrayerAdapter implements PrayerByCity {

    private PrayerByCoordinates prayerByCoordinates;

    public CityPrayerAdapter(PrayerByCoordinates prayerByCoordinates) {
        this.prayerByCoordinates = prayerByCoordinates;
    }

    @Override
    public String getPrayerTimes(String city) {
        if (city.equalsIgnoreCase("Jeddah")) {
            return this.prayerByCoordinates.getPrayerTimes(21.492500, 39.177570);
        }
        return "I do not know";
    }
}
