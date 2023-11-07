import java.util.HashMap;
import java.util.Map;

class CachingProxy implements DataService {
    private FetchingDataService fetchingDataService;
    private Map<String, String> cache;

    public CachingProxy() {
        this.fetchingDataService = new FetchingDataService();
        this.cache = new HashMap<>();
    }

    @Override
    public String fetchData(String key) {
        // Check if the data is in the cache
        if (cache.containsKey(key)) {
            System.out.println("Fetching data from cache for key: " + key);
            return cache.get(key);
        } else {
            // If not in the cache, fetch it from the fetching data service
            String data = fetchingDataService.fetchData(key);
            // Store it in the cache for future use
            cache.put(key, data);
            return data;
        }
    }
}