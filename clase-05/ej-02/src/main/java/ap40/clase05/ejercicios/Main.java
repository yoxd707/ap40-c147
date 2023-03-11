package ap40.clase05.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main( String[] args ) throws IOException {
        // 2) En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una
        // lista de items, arme los objetos correspondientes y con el método de carrito “precio”,
        // retorne el resultado.

        //* Adjunto ya un archivo con la tabla csv, dir: src/main/resources/carrito.csv

        String dir = args.length == 0
            ? "src/main/resources/carrito.csv"
            : args[0];

        Path path = Paths.get(dir).toAbsolutePath();
        String csv = Files.readString(path);
        TablaCsv tabla = TablaCsv.parse(csv);

        Carrito carrito = Carrito.cargarTabla(tabla);

        System.out.println(carrito.precio());
    }

}
