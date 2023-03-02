public class Main {
    public static void main(String[] args) {
        // 1) Utilizando solo tipos primitivos, String (solo usar método length), vectores,
        // iteraciones simples y condicionales, genere una clase por ejercicio que posea los
        // siguientes métodos:
        // b) Dados 3 números y un orden (ascendente o decreciente) que ordene los
        // mismos y los retorne en un vector de 3.

        for (int n : ordenarEnteros(5, 3, 9, "asc"))
            System.out.println(n);
    }

    public static int[] ordenarEnteros(int a, int b, int c, String orden) {
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
