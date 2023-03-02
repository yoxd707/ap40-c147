package ap40.clase03.ejercicios;

public class Main {
    public static void main(String[] args) {
        // 2) Genere una clase que tenga los métodos para realizar la codificación y decodificación
        // de un string, dado un número de desplazamiento.
        String texto = "Hello World!";
        String textoCodificado = CodificadorDecodificador.codificar(texto, 1);
        String textoDecodificado = CodificadorDecodificador.decodificar(textoCodificado, 1);

        System.out.println(textoCodificado);
        System.out.println(textoDecodificado);
    }
}
