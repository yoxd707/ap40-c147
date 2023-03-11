package ap40.clase05.ejercicios;

public class Producto {

    private final String nombre;
    private final float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getPrecio() {
        return this.precio;
    }

}
