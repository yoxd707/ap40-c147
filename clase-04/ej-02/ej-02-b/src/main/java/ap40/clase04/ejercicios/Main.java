package ap40.clase04.ejercicios;

import java.io.IOException;

public class Main {

    public static void main( String[] args ) throws IOException {
        // 2) Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
        // contener números.
        // b) Al programa anterior agreguele un parámetro para que la operación pueda ser
        // suma o multiplicación.

        //* Adjunto ya un archivo con los números, dir: src/main/resources/numeros.txt

        String dir = (args.length == 0)
            ? "src/main/resources/numeros.txt"
            : args[0];

        boolean dirEsAbsoluto = (args.length < 2)
            ? true
            : Boolean.parseBoolean(args[1]);

        String operacion = (args.length < 3)
            ? "sum"
            : args[2];

        int[] numeros = AdquisidorDeNumeros.adquirirEnterosDesdeArchivo(dir, dirEsAbsoluto);
        int resultado = operacion.equals("sum")
            ? Sumatoria.sumatoriaDeEnteros(numeros)
            : Multiplicador.multiplicacionDeEnteros(numeros);

        System.out.println(resultado);
    }

}
