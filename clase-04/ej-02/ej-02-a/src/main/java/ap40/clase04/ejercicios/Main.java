package ap40.clase04.ejercicios;

import java.io.IOException;

public class Main {

    public static void main( String[] args ) throws IOException {
        // 2) Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
        // contener números.
        // a) El programa debe escribir por consola la suma de esos números.

        //* Adjunto ya un archivo con los números, dir: src/main/resources/numeros.txt

        String dir = (args.length == 0)
            ? "src/main/resources/numeros.txt"
            : args[0];

        boolean dirEsAbsoluto = (args.length < 2)
            ? true
            : Boolean.parseBoolean(args[1]);

        int[] numeros = AdquisidorDeNumeros.adquirirEnterosDesdeArchivo(dir, dirEsAbsoluto);
        int sumatoria = Sumatoria.sumatoriaDeEnteros(numeros);

        System.out.println(sumatoria);
    }

}
