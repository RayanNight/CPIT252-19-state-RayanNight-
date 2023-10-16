public class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public DatabaseConnection connect() {
        // Connect to PostgreSQL database
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_database", "postgres", "password");
    }
}