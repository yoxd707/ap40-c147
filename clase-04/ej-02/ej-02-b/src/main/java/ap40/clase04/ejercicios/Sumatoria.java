package ap40.clase04.ejercicios;

public class Sumatoria {

    public static int sumatoriaDeEnteros(int[] enteros) {
        int resultado = 0;

        for (int i : enteros)
            resultado += i;

        return resultado;
    }

}
