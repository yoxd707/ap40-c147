package ap40.clase09.ejercicios;

public class Main {

    public static void main( String[] args ) {
        // 1) Crear un proyecto nuevo mediante Maven.

        // 2) Agregar la dependencia necesaria para utilizar Lombok

        // 3) Crear un programa Java que pida por consola el nombre, apellido y fecha de
        // nacimiento de una persona. Estos datos deben ser guardados en una instancia de una
        // clase Persona utilizando los setters generados por Lombok.
        // IMPORTANTE: el programa debe permitir cargar varias personas y también debe ofrecer la posibilidad
        // de listar a todas las personas por pantalla (utilizar los getters generados por Lombok).

        // 4) Generar un archivo “jar” del proyecto implementado. Ejecutarlo desde la terminal del
        // Sistema Operativo.

        Programa programa = new Programa();
        programa.setAccion(new AccionPrincipal(programa));
        programa.Iniciar();

        // Solo si el programa finaliza.
        programa.getScanner().close();
    }

}
