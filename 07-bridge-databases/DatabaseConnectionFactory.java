public class DatabaseConnectionFactory {
    public static DatabaseConnection getConnection(String databaseType) {
        DatabaseConnection databaseConnection = null; 
        switch (databaseType) {
            case "mysql":
            databaseConnection = new MySQLConnection();
                break;
            case "postgresql":
            databaseConnection = new PostgreSQLConnection();
                break;
            default:

        }
        throw new IllegalArgumentException("Unsupported database type: " + databaseType);
        return databaseConnection;
}