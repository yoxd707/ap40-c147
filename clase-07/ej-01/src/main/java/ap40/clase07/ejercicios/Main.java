package ap40.clase07.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main( String[] args ) throws IOException {
        // 1) Al programa del carrito de la clase 5, agregue un parámetro que indique si hay un
        // descuento fijo o porcentual y ponga el valor del mismo.

        //* Adjunto ya un archivo con la tabla csv, dir: src/main/resources/carrito.csv

        String dir = args.length == 0
            ? "src/main/resources/carrito.csv"
            : args[0];

        DescuentoTipos descTipo = args.length > 1
            ? DescuentoTipos.valueOf(args[1].toUpperCase())
            : DescuentoTipos.SIN;

        float descValor = args.length > 2
            ? Float.parseFloat(args[2])
            : 0f;

        Path path = Paths.get(dir).toAbsolutePath();
        String csv = Files.readString(path);
        TablaCsv tabla = TablaCsv.parse(csv);

        Carrito carrito = Carrito.cargarTabla(tabla);

        Descuento descuento = null;

        if (descTipo.equals(DescuentoTipos.FIJO)) descuento = new DescuentoFijo(descValor);
        if (descTipo.equals(DescuentoTipos.PORCENTUAL)) descuento = new DescuentoPorcentaje(descValor / 100f);

        System.out.println(carrito.precio(descuento));
    }

}
