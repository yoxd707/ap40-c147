package ap40.clase08.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main( String[] args ) throws IOException {
        // 1) Modifique el ejercicio del carrito de la clase 5-7, para tener una cantidad ilimitada de
        // ítems. Verifique que cuando lea un archivo pueda leer items de cualquier tamaño.

        // 2) Agregue excepciones a los descuentos:
        //    a - Que no se pueda aplicar un descuento a un carrito de precio 0
        //    b - Que el resultado del descuento no de un monto negativo
        //    c - Si ocurre alguna de esas 2 situaciones, mostrar por pantalla el error, en lugar
        // del resultado del carrito.

        // 3) Realice algún test para probar la funcionalidad de las 2 excepciones planteadas.

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

        float descTope = args.length > 3
            ? Float.parseFloat(args[3])
            : 0f;

        Path path = Paths.get(dir).toAbsolutePath();
        String csv = Files.readString(path);
        TablaCsv tabla = TablaCsv.parse(csv);

        Carrito carrito = Carrito.cargarTabla(tabla);

        Descuento descuento = null;

        if (descTipo.equals(DescuentoTipos.FIJO)) descuento = new DescuentoFijo(descValor);
        if (descTipo.equals(DescuentoTipos.PORCENTUAL)) descuento = new DescuentoPorcentaje(descValor / 100f);
        if (descTipo.equals(DescuentoTipos.PORCENTUAL_CON_TOPE)) descuento = new DescuentoPorcentajeConTope(descValor / 100f, descTope);

        try {
            float precioCarrito = carrito.precio(descuento);
            System.out.println("El precio del carrito es: $" + precioCarrito);
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
