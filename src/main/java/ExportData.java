import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExportData {
    public void exportTransactions(int id, String transaction) throws SQLException {
    ResultSet rs = null;
    Connection connection = JDBCConnector.getConnection();
    String query = " INSERT INTO Transactions (idCustomer, transaction)"
            + " values (?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,transaction);
        preparedStatement.executeUpdate();
}
}
