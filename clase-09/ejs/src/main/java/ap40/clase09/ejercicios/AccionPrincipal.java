package ap40.clase09.ejercicios;

import java.util.Scanner;

public class AccionPrincipal extends Accion {

    public AccionPrincipal(Programa programa) {
        super(programa);
    }

    @Override
    public void EjecutarAccion() {
        Programa.limpiarConsola();

        System.out.println("1 - Ingresar persona");
        System.out.println("2 - Mostrar listado de personas");
        System.out.println("3 - Salir");

        Scanner scanner = programa.getScanner();
        String entrada = scanner.nextLine().trim();

        if (!validarEntrada(entrada)) {
            System.out.println("No ha ingresado un valor válido.");
            System.out.println("Presione cualquier tecla para continuar.");
            scanner.nextLine();
            return;
        }

        ejecutarEntrada(entrada);
    }

    private boolean validarEntrada(String entrada) {
        return (
            (entrada.length() == 1) &&
            (entrada.equals("1") || entrada.equals("2") || entrada.equals("3"))
        );
    }

    private void ejecutarEntrada(String entrada) {
        Accion accion = this;

        if (entrada.equals("1")) accion = new AccionIngresarPersona(programa);

        if (entrada.equals("2")) accion = new AccionMostrarListadoPersonas(programa);

        if (entrada.equals("3")) accion = new AccionSalir(programa);

        programa.setAccion(accion);
    }

}
