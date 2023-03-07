package ap40.clase04.ejercicios;

public class CodificadorDecodificador {

    public static String codificar(String texto, int desplazamiento) {
        return desplazar(texto, desplazamiento);
    }

    public static String decodificar(String texto, int desplazamiento) {
        return desplazar(texto, -desplazamiento);
    }

    public static String desplazar(String texto, int desplazamiento) {
        String resultado = new String();

        for (char i : texto.toCharArray())
            resultado += (char)(i + desplazamiento);

        return resultado;
    }

}
