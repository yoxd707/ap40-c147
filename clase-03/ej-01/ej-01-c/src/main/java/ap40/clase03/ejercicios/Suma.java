package ap40.clase03.ejercicios;

public class Suma {

    public static int sumatoriaMayor(int[] array, int x) {
        int resultado = 0;

        for (int i : array)
            if (i > x) resultado += i;

        return resultado;
    }

}
