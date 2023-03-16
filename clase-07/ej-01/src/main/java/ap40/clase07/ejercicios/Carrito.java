package ap40.clase07.ejercicios;

import java.util.Date;

public class Carrito {

    private int fecha;
    private ItemCarrito[] items;

    public Carrito(int fecha, ItemCarrito[] items) {
        this.fecha = fecha;
        this.items = items;
    }

    public float precio(Descuento desc) {
        float base = 0f;

        for (ItemCarrito item : this.items)
            base += item.precio();

        if (desc == null) return base;

        return desc.valorFinal(base);
    }


    public static Carrito cargarTabla(TablaCsv tabla) {
        ItemCarrito[] items = new ItemCarrito[tabla.getCantFilas()];

        for (int i = 0; i < items.length; i++) {
            int cant = Integer.parseInt(tabla.getCelda(0, i));

            float precioProducto = Float.parseFloat(tabla.getCelda(1, i));
            String nombreProducto = tabla.getCelda(2, i);
            String codigoProducto = tabla.getCelda(3, i);

            Producto producto = new Producto(nombreProducto, codigoProducto, precioProducto);

            items[i] = new ItemCarrito(cant, producto);
        }

        return new Carrito((int) (new Date().getTime()/1000), items);
    }

}
