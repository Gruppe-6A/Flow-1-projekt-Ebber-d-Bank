import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    public static Connection getConnection() throws SQLException {
        String user = "root";
        String password = "myPassword";
        String url = "jdbc:mysql://localhost:3306/BankDemo";

        Connection connection = null;
        //connection = DriverManager.getConnection(url, user, password);
        try {
            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
