import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyConnection myConnection = new MyConnection();

        try (Connection connection = myConnection.getConnection()) {
            System.out.println("Connection: " + connection);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}