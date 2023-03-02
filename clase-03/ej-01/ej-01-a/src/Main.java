public class Main {
    public static void main(String[] args) {
        // 1) Utilizando solo tipos primitivos, String (solo usar método length), vectores,
        // iteraciones simples y condicionales, genere una clase por ejercicio que posea los
        // siguientes métodos:
        // a) Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        // el String.

        System.out.println(cantidadDeApariciones("Hola mundo!", 'o'));
    }

    public static int cantidadDeApariciones(String texto, char letra) {
        int contador = 0;

        for (char i : texto.toCharArray()) {
            if (i == letra) contador++;
        }

        return contador;
    }
}
