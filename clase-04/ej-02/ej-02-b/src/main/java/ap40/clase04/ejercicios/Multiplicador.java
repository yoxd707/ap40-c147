package ap40.clase04.ejercicios;

public class Multiplicador {

    public static int multiplicacionDeEnteros(int[] enteros) {
        int resultado = 1;

        for (int i : enteros)
            resultado *= i;

        return enteros.length != 0 ? resultado : 0;
    }

}
