package ap40.clase11.ejercicios;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AccionLeerMensajes extends Accion {

    @Override
    public void EjecutarAccion() {
        Programa.limpiarConsola();
        String mensajes = "";

        try {
            mensajes = Files.readString(Paths.get("src/main/resources/mensajes.txt"));
        }
        catch (Exception ex) {
            mensajes = "Ocurrió un error al intentar obtener los mensajes...";
        }

        System.out.println(mensajes);

        programa.getScanner().nextLine();
        programa.setAccion(new AccionPrincipal());
    }

}
