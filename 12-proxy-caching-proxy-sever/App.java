public class App {
    public static void main(String[] args) {
        // Create a caching proxy for the data retrieval service
        DataService proxy = new CachingProxy();

        // Fetch data through the proxy
        System.out.println(proxy.fetchData("Key1"));
        System.out.println(proxy.fetchData("Key2"));

        // The second request for "Key1" should retrieve it from the cache
        System.out.println(proxy.fetchData("Key1"));
    }
}