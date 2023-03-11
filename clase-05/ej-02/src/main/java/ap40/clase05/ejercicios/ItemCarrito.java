package ap40.clase05.ejercicios;

public class ItemCarrito {

    private final int cantidad;
    private final Producto producto;

    public ItemCarrito(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public float precio() {
        return this.cantidad * this.producto.getPrecio();
    }

}
