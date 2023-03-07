package ap40.clase04.ejercicios;

import java.io.IOException;

public class Main {

    public static void main( String[] args ) throws IOException {
        // 3) Tome el ejercicio 2 de la clase 3 y que por parámetro se pueda elegir si es una
        // codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
        // otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
        // resultados deben estar en el archivo de salida.

        //* Adjunto ya un archivo con la entrada y salida,
        //* Las direcciones especificadas serán interpretadas como relativas.
        //* dirEntrada: src/main/resources/entrada.txt
        //* dirSalida: src/main/resources/salida.txt

        String operacion = (args.length == 0)
            ? "cod"
            : args[0];

        int desplazamiento = (args.length > 1)
            ? Integer.parseInt(args[1])
            : 0;

        String dirEntrada = (args.length > 2)
            ? args[2]
            : "src/main/resources/entrada.txt";

        String dirSalida = (args.length > 3)
            ? args[3]
            : "src/main/resources/salida.txt";

        if (operacion.equals("cod"))
            CodificadorDecodificadorDeArchivos.codificarArchivo(dirEntrada, dirSalida, desplazamiento);
        else
            CodificadorDecodificadorDeArchivos.decodificarArchivo(dirEntrada, dirSalida, desplazamiento);

        System.out.println("Los datos han sido procesados exitosamente.");
    }

}
