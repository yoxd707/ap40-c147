package ap40.clase11.ejercicios;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AccionEnviarMensaje extends Accion {

    @Override
    public void EjecutarAccion() {
        Programa.limpiarConsola();
        System.out.println("Escriba su mensaje o deje en blanco para cancelar");

        Scanner scanner = programa.getScanner();
        String mensaje = scanner.nextLine().trim();

        try {
            if (mensaje.length() > 0)
                Files.writeString(Paths.get("src/main/resources/mensajes.txt"), "\n" + programa.getUsuario() + " > " + mensaje, StandardOpenOption.APPEND);
        }
        catch (Exception ex) {
            System.out.println("Ocurrió un error al enviar el mensaje, presione enter para salir.");
            scanner.nextLine();
        }

        programa.setAccion(new AccionPrincipal());
    }

}
