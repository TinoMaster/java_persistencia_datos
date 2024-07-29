import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        MyConnection db_connect = new MyConnection();

        try (Connection connection = db_connect.getConnection()) {
            PreparedStatement preparedStatement = null;

            try {
                String query = "INSERT INTO mensajes VALUES (null,?,?,?)";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mensaje.getMensaje());
                preparedStatement.setString(2, mensaje.getAutor_mensaje());
                preparedStatement.setString(3, mensaje.getFecha_mensaje());
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void leerMensajesDB() {

    }

    public static void borrarMensajesDB(int id_mensaje) {

    }

    public static void actualizarMensajesDB(Mensajes mensaje) {

    }
}
