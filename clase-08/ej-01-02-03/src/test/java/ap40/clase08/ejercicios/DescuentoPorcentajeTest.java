package ap40.clase08.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescuentoPorcentajeTest {

    @Test
    public void valorFinal_deberiaSerCorrecto() {
        Descuento descuento = new DescuentoPorcentaje(1f);
        float resultado = descuento.valorFinal(10f);

        Assertions.assertEquals(0f, resultado);
    }

}
