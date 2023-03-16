package ap40.clase07.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescuentoPorcentajeConTopeTest {

    @Test
    public void valorFinal_deberiaSerCorrecto() {
        Descuento descuento = new DescuentoPorcentajeConTope(1f, 5f);
        float resultado = descuento.valorFinal(10f);

        Assertions.assertEquals(5f, resultado);
    }

}
