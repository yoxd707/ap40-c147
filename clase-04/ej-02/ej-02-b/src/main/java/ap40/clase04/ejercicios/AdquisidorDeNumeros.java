package ap40.clase04.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AdquisidorDeNumeros {

    public static int[] adquirirEnterosDesdeArchivo(String dir, boolean dirEsAbsoluto) throws IOException {
        Path path = dirEsAbsoluto
            ? Paths.get(dir)
            : Paths.get(dir).toAbsolutePath();

        String[] datos = Files.readString(path)
            .replace('\n', ' ')
            .split(" ");

        int[] numeros = new int[datos.length];

        for (int i = 0; i < datos.length; i++)
            numeros[i] = Integer.parseInt(datos[i].trim());

        return numeros;
    }

}
