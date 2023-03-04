package ap40.clase03.ejercicios;

public class ContadorDeLetras {

    public static int cantidadDeApariciones(String texto, char letra) {
        int contador = 0;

        for (char i : texto.toCharArray()) {
            if (i == letra) contador++;
        }

        return contador;
    }

}
