public class Main {
    public static void main(String[] args) {
        // 1) Utilizando solo tipos primitivos, String (solo usar método length), vectores,
        // iteraciones simples y condicionales, genere una clase por ejercicio que posea los
        // siguientes métodos:
        // b) dado un vector de números, y un número X, que sume todos los números > X y
        // retorne el resultado.

        System.out.println(sumatoriaMayor(new int[] { 0, 1, 2, 6, 4, 3 }, 3));
    }

    public static int sumatoriaMayor(int[] array, int x) {
        int resultado = 0;

        for (int i : array)
            if (i > x) resultado += i;

        return resultado;
    }
}
