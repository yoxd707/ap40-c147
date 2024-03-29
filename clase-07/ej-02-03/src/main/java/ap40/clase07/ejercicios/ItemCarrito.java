package ap40.clase07.ejercicios;

public class ItemCarrito {

    private int cantidad;
    private Producto producto;

    public ItemCarrito(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public float precio() {
        return this.cantidad * this.producto.costoFinal(1);
    }

}
