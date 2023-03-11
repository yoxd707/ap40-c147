package ap40.clase05.ejercicios;

public class Main {

    public static void main( String[] args ) {
        // 1) Implemente usted mismo el ejemplo visto en clase de “carrito de compras”: una clase
        // Producto (que pueda tener hasta 3 items), otra ItemCarrito, otra Carrito y otra
        // Descuento, con 2 subclases.

        Producto arroz = new Producto("Arroz", "1234567890", 138.29f);
        Producto tallarines = new Producto("Tallarines", "0987654321", 450f);

        ItemCarrito itemCarrito1 = new ItemCarrito(1, arroz);
        ItemCarrito itemCarrito2 = new ItemCarrito(2, tallarines);

        Carrito carrito = new Carrito(962074800, new ItemCarrito[] { itemCarrito1, itemCarrito2 });

        System.out.println(carrito.precio(new DescuentoFijo(0f)));
    }

}
