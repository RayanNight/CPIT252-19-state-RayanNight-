class FetchingDataService implements DataService {
    @Override
    public String fetchData(String key) {
        System.out.println("Fetching data for key: " + key);
        return "Data for " + key;
    }
}