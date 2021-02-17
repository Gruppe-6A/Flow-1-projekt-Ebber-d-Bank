import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class importData {

    public int importBalance(int id) throws SQLException {
        int saldo = 0;
        String sql = "select balance from customer where idCustomer = "+id+";";
        Connection connection = JDBCConnector.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            saldo = resultSet.getInt("balance");
        }
        return saldo;
    }
}
