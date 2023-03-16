package ap40.clase07.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescuentoFijoTest {

    @Test
    public void valorFinal_deberiaSerCorrecto() {
        Descuento descuento = new DescuentoFijo(10f);
        float resultado = descuento.valorFinal(10f);

        Assertions.assertEquals(0f, resultado);
    }

}
