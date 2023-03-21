package ap40.clase08.ejercicios;

public class Producto {

    private String nombre;
    private String codigo;
    private float precio;

    public Producto(String nombre, String codigo, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public float costoFinal(int cantCuotas) {
        if (cantCuotas <= 0) return 0f;
        return this.precio / cantCuotas;
    }

}
