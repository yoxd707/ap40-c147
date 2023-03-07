package ap40.clase04.ejercicios;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        // 1) Tomando los Ejercicios de la clase anterior.
        // c) lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
        // si no detecta ninguno. Vea si con una función puede evitar repetir código.

        String[] argumentos = args.length > 0
            ? args
            : obtenerArgumentosPorConsola();

        int a = Integer.parseInt(argumentos[0]);
        int b = Integer.parseInt(argumentos[1]);
        int c = Integer.parseInt(argumentos[2]);
        String orden = argumentos[3];

        for (int i : OrdenadorDeEnteros.ordenar(a, b, c, orden))
            System.out.println(i);
    }

    private static String[] obtenerArgumentosPorConsola() {
        String[] resultado = new String[4];
        Scanner scn = new Scanner(System.in);

        resultado[0] = pedirArgumentoPorConsola("Escriba el primer número.", scn);
        resultado[1] = pedirArgumentoPorConsola("Escriba el segundo número.", scn);
        resultado[2] = pedirArgumentoPorConsola("Escriba el tercer número.", scn);
        resultado[3] = pedirArgumentoPorConsola("Escriba el orden.", scn);

        scn.close();

        return resultado;
    }

    private static String pedirArgumentoPorConsola(String mensajeDelPedido, Scanner scn) {
        System.out.println(mensajeDelPedido);
        return scn.nextLine();
    }

}
