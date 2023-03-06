package ap40.clase04.ejercicios;

public class Main {
    public static void main( String[] args ) {
        // 1) Tomando los Ejercicios de la clase anterior.
        // a) haga un main, donde por parámetro ponga 3 números y una letra que
        // represente ascendente o descendente y los muestre ordenados por tal criterio.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        String orden = args[3];

        for (int i : OrdenadorDeEnteros.ordenar(a, b, c, orden))
            System.out.println(i);
    }
}
