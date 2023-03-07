package ap40.clase04.ejercicios;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        // 1) Tomando los Ejercicios de la clase anterior.
        // b) haga lo mismo, pero solicitando los parámetros de a uno por consola.

        Scanner scn = new Scanner(System.in);

        System.out.println("Escriba el primer número.");
        int a = Integer.parseInt(scn.nextLine());

        System.out.println("Escriba el segundo número.");
        int b = Integer.parseInt(scn.nextLine());

        System.out.println("Escriba el tercer número.");
        int c = Integer.parseInt(scn.nextLine());

        System.out.println("Escriba el orden.");
        String orden = scn.nextLine();

        scn.close();

        for (int i : OrdenadorDeEnteros.ordenar(a, b, c, orden))
            System.out.println(i);
    }
}
