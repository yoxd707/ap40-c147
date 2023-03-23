package ap40.clase09.ejercicios;

public class AccionMostrarListadoPersonas extends Accion {

    public AccionMostrarListadoPersonas(Programa programa) {
        super(programa);
    }

    @Override
    public void EjecutarAccion() {
        Programa.limpiarConsola();

        System.out.print(completarConEspacios("Nombre", 20));
        System.out.print(completarConEspacios("Apellido", 20));
        System.out.println("Fecha de nacimiento");

        for (Persona persona : programa.getListadoPersonas()) {
            System.out.print(completarConEspacios(persona.getNombre(), 20));
            System.out.print(completarConEspacios(persona.getApellido(), 20));
            System.out.println(persona.getFechaNacimiento());
        }

        System.out.println();
        System.out.println("Presiona cualquier tecla para salir.");

        programa.getScanner().nextLine();
        programa.setAccion(new AccionPrincipal(programa));
    }

    private String completarConEspacios(String msg, int longitud) {
        String resultado = "" + msg;

        for (int i = msg.length(); i < longitud; i++)
            resultado += " ";

        return resultado;
    }

}
