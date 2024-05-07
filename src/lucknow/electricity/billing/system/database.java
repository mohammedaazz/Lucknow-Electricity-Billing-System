package lucknow.electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
    Connection connection;
    Statement statement;

    database(){
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bills_system", "root", "121725");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
