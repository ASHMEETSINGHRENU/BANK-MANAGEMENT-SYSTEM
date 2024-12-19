package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cone {
    Connection connection;
    Statement statement;

    public Cone() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management", "root", "");

            // Create a statement object
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//mySql query :-
//create table signuptwo(form_no varchar(30),
//              religion var(30),
//              categroy var(30),
//              income var (30),
//              education var (30),
//              occupation var(30),
//              pan var (30),
//              aadhar var (60),
//              seniorcitizen var (30),
//              existing_ac var (30)
//              );


