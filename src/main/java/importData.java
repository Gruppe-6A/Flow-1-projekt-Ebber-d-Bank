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
    public void importTransactions(int id){
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * from Transactions where idCustomer = " + id + ";";
        try {
            Connection connection = JDBCConnector.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int thisId = resultSet.getInt("idCustomer");
                String transaction = resultSet.getString("transaction");

                System.out.println("Id: " + thisId + " " + transaction);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
