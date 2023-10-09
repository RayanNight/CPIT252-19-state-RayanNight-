import java.sql.Connection;
import java.sql.ResultSet;

class App{
    public static void main(String[] args) {
// Get a database connection for the specified database type
DatabaseConnection connection = DatabaseConnectionFactory.getConnection("mysql");

// Connect to the database
Connection jdbcConnection = connection.connect();

// Execute SQL queries
Statement statement = jdbcConnection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

// Iterate over the results
while (resultSet.next()) {
    int id = resultSet.getInt("id");
    String name = resultSet.getString("name");

    System.out.println(id + ": " + name);
}

// Close the database connection
jdbcConnection.close();
    }
}