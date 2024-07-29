import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc = 0;

        do {
            System.out.println("---------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. editar mensaje");
            System.out.println("4. eliminar mensaje");
            System.out.println("5. salir");

            System.out.println("---------------------");
            System.out.println("elige una opción");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    MensajesService.CrearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

        } while (opc != 5);

        MyConnection myConnection = new MyConnection();

        try (Connection connection = myConnection.getConnection()) {
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}