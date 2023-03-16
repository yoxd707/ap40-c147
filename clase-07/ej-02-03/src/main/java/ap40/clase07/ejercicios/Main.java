package ap40.clase07.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main( String[] args ) throws IOException {
        // 2) Agregue un nuevo descuento porcentual, pero que tenga un tope Fijo en una nueva clase
        // DescuentoPorcentajeConTope.

        // 3) Cree 2 o 3 Tests para el método “precio” del carrito, y para los 3 descuentos
        // DescuentoFijo, DescuentoPorcentaje y DescuentoPorcentajeConTope.

        //* Adjunto ya un archivo con la tabla csv, dir: src/main/resources/carrito.csv

        String dir = args.length == 0
            ? "src/main/resources/carrito.csv"
            : args[0];

        DescuentoTipos descTipo = args.length > 0
            ? DescuentoTipos.valueOf(args[1].toUpperCase())
            : DescuentoTipos.SIN;

        float descValor = args.length > 1
            ? Float.parseFloat(args[2]) / 100f
            : 0f;

        float descTope = args.length > 2
            ? Float.parseFloat(args[3])
            : 0f;

        Path path = Paths.get(dir).toAbsolutePath();
        String csv = Files.readString(path);
        TablaCsv tabla = TablaCsv.parse(csv);

        Carrito carrito = Carrito.cargarTabla(tabla);

        Descuento descuento = null;

        if (descTipo.equals(DescuentoTipos.FIJO)) descuento = new DescuentoFijo(descValor);
        if (descTipo.equals(DescuentoTipos.PORCENTUAL)) descuento = new DescuentoPorcentaje(descValor);
        if (descTipo.equals(DescuentoTipos.PORCENTUAL_CON_TOPE)) descuento = new DescuentoPorcentajeConTope(descValor, descTope);

        System.out.println(carrito.precio(descuento));
    }

}
