package ap40.clase05.ejercicios;

public class Carrito {

    private final ItemCarrito[] items;

    public Carrito(ItemCarrito[] items) {
        this.items = items;
    }

    public float precio() {
        float resultado = 0f;

        for (ItemCarrito item : this.items)
            resultado += item.precio();

        return resultado;
    }


    public static Carrito cargarTabla(TablaCsv tabla) {
        ItemCarrito[] items = new ItemCarrito[tabla.getCantFilas()];

        for (int i = 0; i < items.length; i++) {
            int cant = Integer.parseInt(tabla.getCelda(0, i));

            float precioProducto = Float.parseFloat(tabla.getCelda(1, i));
            String nombreProducto = tabla.getCelda(2, i);

            Producto producto = new Producto(nombreProducto, precioProducto);

            items[i] = new ItemCarrito(cant, producto);
        }

        return new Carrito(items);
    }
}
