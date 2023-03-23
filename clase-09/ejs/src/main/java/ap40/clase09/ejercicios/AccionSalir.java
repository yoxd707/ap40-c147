package ap40.clase09.ejercicios;

import java.util.Scanner;

public class AccionSalir extends Accion {

    public AccionSalir(Programa programa) {
        super(programa);
    }

    @Override
    public void EjecutarAccion() {
        Programa.limpiarConsola();

        System.out.println("Estas segur@ de querer salir?");
        System.out.println("1 - Cancelar");
        System.out.println("Cualquier otra - Salir");

        Scanner scanner = programa.getScanner();
        String entrada = scanner.nextLine().trim();

        if (entrada.equals("1")) {
            programa.setAccion(new AccionPrincipal(programa));
            return;
        }

        programa.Detener();
    }

}
