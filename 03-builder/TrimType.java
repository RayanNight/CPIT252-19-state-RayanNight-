
// Define the TrimType enum
enum TrimType {
    // Cars should have a base trim and a full trim
    BASE, FULL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
