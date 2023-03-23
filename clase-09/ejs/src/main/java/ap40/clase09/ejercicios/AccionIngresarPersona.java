package ap40.clase09.ejercicios;

import java.util.Scanner;

public class AccionIngresarPersona extends Accion {

    public AccionIngresarPersona(Programa programa) {
        super(programa);
    }

    @Override
    public void EjecutarAccion() {
        Programa.limpiarConsola();

        Persona persona = new Persona();
        Scanner scanner = programa.getScanner();

        System.out.println("Ingrese el nombre");
        persona.setNombre(scanner.nextLine().trim());

        System.out.println("Ingrese el apellido");
        persona.setApellido(scanner.nextLine().trim());

        System.out.println("Ingrese la fecha de nacimiento");
        persona.setFechaNacimiento(scanner.nextLine().trim());

        System.out.println();

        if (!validarPersona(persona))
            System.out.println("Los datos ingresados no son válidos.");
        else {
            programa.getListadoPersonas().add(persona);
            System.out.println("Persona ingresada correctamente.");
        }

        System.out.println();

        System.out.println("1 - Ingresar otra");
        System.out.println("Cualquier otra - Salir");

        String entrada = scanner.nextLine().trim();

        if (!entrada.equals("1"))
            programa.setAccion(new AccionPrincipal(programa));
    }

    private boolean validarPersona(Persona persona) {
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        String fechaNacimiento = persona.getFechaNacimiento();

        return (
            (nombre != null && apellido != null && fechaNacimiento != null) &&
            (!nombre.isEmpty() && !apellido.isEmpty() && !fechaNacimiento.isEmpty())
        );
    }

}
