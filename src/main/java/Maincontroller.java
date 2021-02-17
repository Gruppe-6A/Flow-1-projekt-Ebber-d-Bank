import java.io.IOException;
import java.sql.SQLException;

public class Maincontroller {
    public Maincontroller(){}
    Menu menu = new Menu();

    public void doThisFirst() throws SQLException {
        menu.onStartup();
    }
}
