package ap40.clase03.ejercicios;

public class Main {

    public static void main( String[] args ) {
        // 1) Utilizando solo tipos primitivos, String (solo usar método length), vectores,
        // iteraciones simples y condicionales, genere una clase por ejercicio que posea los
        // siguientes métodos:
        // b) Dados 3 números y un orden (ascendente o decreciente) que ordene los
        // mismos y los retorne en un vector de 3.

        for (int n : OrdenadorDeEnteros.ordenar(5, 3, 9, "asc"))
            System.out.println(n);
    }

}
