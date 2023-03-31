package ap40.clase11.ejercicios;

public class Main {

    public static void main( String[] args ) {
        // Se tienen que ejecutar varios procesos del mismo programa, todos al inicializar, tienen que indicar el nombre de la persona
        // Por la consola tiene que poder ingresar 2 opciones, escribir un mensaje o leer todos los mensajes
        // cuando elige escribir mensaje, se ingresa el mismo y se escribe en el archivo
        // otro proceso debe leer todos los mensajes y ver lo que escribio el anterior
        // El proceso anterior se debe repetir todas las veces que uno quiera
        // Vale aclarar, que no se leen automáticamente los mensajes, uno debe elegir dicha opción.

        Programa programa = new Programa();
        programa.setAccion(new AccionIngresarUsuario());
        programa.Iniciar();

        // Solo si el programa finaliza.
        programa.getScanner().close();
    }

}
