package ap40.clase08.ejercicios;

import java.util.List;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

public class Carrito {

    private int fecha;
    private List<ItemCarrito> items;

    public Carrito(int fecha, ItemCarrito[] items) {
        this.fecha = fecha;
        this.items = new LinkedList<ItemCarrito>(Arrays.asList(items));
    }

    public List<ItemCarrito> getItems() {
        return this.items;
    }

    public float precio(Descuento desc) throws RuntimeException {
        float total = 0f;

        for (ItemCarrito item : this.items)
            total += item.precio();

        if (desc != null) {
            if (total <= 0f) throw new RuntimeException("No se puede aplicar descuento a un carrito con el precio menor o igual a cero.");

            total = desc.valorFinal(total);
        }

        if (total < 0f) throw new RuntimeException("El precio total del carrito es menor a cero.");

        return total;
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
