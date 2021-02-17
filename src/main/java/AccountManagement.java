import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountManagement {
    public void updateBalanceForWithdrawal ( int amount, int id) throws SQLException {
        Connection connection = JDBCConnector.getConnection();
            String query = "update customer set balance = (balance-"+amount+") where idCustomer = "+id+";";
            PreparedStatement pS = connection.prepareStatement(query);
            pS.executeUpdate();

        }


    public void updateBalanceForDeposit ( int amount, int id) throws SQLException {
        Connection connection = JDBCConnector.getConnection();
        String query = "update customer set balance = (balance+"+amount+") where idCustomer = "+id+";";
        PreparedStatement pS = connection.prepareStatement(query);
        pS.executeUpdate();

    }

}
