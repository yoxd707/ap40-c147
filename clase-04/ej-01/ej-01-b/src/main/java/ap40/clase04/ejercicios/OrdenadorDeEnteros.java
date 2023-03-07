package ap40.clase04.ejercicios;

public class OrdenadorDeEnteros {

    public static int[] ordenar(int a, int b, int c, String orden) {
        int[] array = new int[] {
            a,
            b,
            c
        };

        boolean isAsc = orden.equals("asc");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((isAsc && array[i] > array[j]) ||
                    (!isAsc && array[i] < array[j])) {
                    intercambiarEnterosEnArray(array, i, j);
                }
            }
        }

        return array;
    }

    private static void intercambiarEnterosEnArray(int[] array, int indiceA, int indiceB) {
        int k = array[indiceA];
        array[indiceA] = array[indiceB];
        array[indiceB] = k;
    }

}
