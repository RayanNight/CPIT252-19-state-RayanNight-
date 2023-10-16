// Concrete database connection classes
public class MySQLConnection implements DatabaseConnection {
    @Override
    public DatabaseConnection connect() {
        // Connect to MySQL database
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "password");
    }
}