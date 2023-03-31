package ap40.clase11.ejercicios;

import java.util.Scanner;

public class AccionIngresarUsuario extends Accion {

    @Override
    public void EjecutarAccion() {
        Programa.limpiarConsola();

        System.out.println("Bienvenido!!");
        System.out.println("Ingrese su nombre y apellido");

        Scanner scanner = programa.getScanner();
        String entrada = scanner.nextLine().trim();

        while (entrada.length() == 0) {
            System.out.println("Los datos no son válidos, por favor ingrese su nombre y apellido");
            entrada = scanner.nextLine().trim();
        }

        programa.usuario = entrada;
        programa.setAccion(new AccionPrincipal());
    }

}
