package ap40.clase08.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarritoTest {

    private Carrito carrito;


    @BeforeEach
    public void setup() {
        ItemCarrito[] items = new ItemCarrito[] {
            new ItemCarrito(1, new Producto("P1", "C1", 10f)),
            new ItemCarrito(1, new Producto("P2", "C2", 10f)),
            new ItemCarrito(1, new Producto("P3", "C3", 10f))
        };

        carrito = new Carrito(0, items);
    }


    @Test
    public void precioSinDescuento_deberiaSerCorrecto() {
        float precio = carrito.precio(null);

        Assertions.assertEquals(30f, precio);
    }

    @Test
    public void precioConDescuentoFijo_deberiaSerCorrecto() {
        float precio = carrito.precio(new DescuentoFijo(15f));

        Assertions.assertEquals(15f, precio);
    }

    @Test
    public void precioConDescuentoPorcentual_deberiaSerCorrecto() {
        float precio = carrito.precio(new DescuentoPorcentaje(0.5f));

        Assertions.assertEquals(15f, precio);
    }

    @Test
    public void precioConDescuentoPorcentualConTope_deberiaSerCorrecto() {
        float precio = carrito.precio(new DescuentoPorcentajeConTope(0.9f, 15f));

        Assertions.assertEquals(15f, precio);
    }

    @Test
    public void precioSinDescuento_productosConPrecioNegativo_deberiaLanzarExcepcion() {
        List<ItemCarrito> items = carrito.getItems();
        items.clear();
        items.add(new ItemCarrito(10, new Producto("Test", "1234567890", -10f)));

        Assertions.assertThrows(RuntimeException.class, () -> carrito.precio(null));
    }

    @Test
    public void precioConDescuentoFijo_totalMenorIgualCero_deberiaLanzarExcepcion() {
        Assertions.assertThrows(RuntimeException.class, () -> carrito.precio(new DescuentoFijo(100f)));
    }

}
