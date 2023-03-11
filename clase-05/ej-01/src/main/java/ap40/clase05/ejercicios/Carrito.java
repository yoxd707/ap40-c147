package ap40.clase05.ejercicios;

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

        return desc.valorFinal(base);
    }

}
