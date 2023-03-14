package ap40.clase06.ejercicios;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadora {

    private final Calculadora calculadora;


    public TestCalculadora() {
        this.calculadora = new Calculadora();
    }


    @Test
    public void sumar_deberiaSerCorrecto() {
        // El resultado de sumar 40 y 55, da 95.
        double resultado = this.calculadora.sumar(40, 55);

        Assert.assertEquals(95, resultado, 0);
    }

    @Test
    public void restar_deberiaSerCorrecto() {
        // El resultado de restar 95 y 55, da 40.
        double resultado = this.calculadora.restar(95, 55);

        Assert.assertEquals(40, resultado, 0);
    }

    @Test
    public void multiplicar_deberiaSerCorrecto() {
        // El resultado de multiplicar 4 y 8, da 32.
        double resultado = this.calculadora.multiplicar(4, 8);

        Assert.assertEquals(32, resultado, 0);
    }

    @Test
    public void dividir_deberiaSerCorrecto() {
        // El resultado de dividir 32 y 8, da 4.
        double resultado = this.calculadora.dividir(32, 8);

        Assert.assertEquals(4, resultado, 0);
    }


    //* Tests pedidos en el ejercicio.

    @Test
    public void item1_deberiaSerCorrecto() {
        // El resultado de multiplicar 80 por 3 da 240.
        double resultado = this.calculadora.multiplicar(80, 3);

        Assert.assertEquals(240, resultado, 0);
    }

    @Test
    public void item2_deberiaSerCorrecto() {
        // El resultado de sumar 150 y 180, dividido por 3, da 110.
        double rSuma = this.calculadora.sumar(150, 180);
        double resultado = this.calculadora.dividir(rSuma, 3);

        Assert.assertEquals(110, resultado, 0);
    }

    @Test
    public void item3_deberiaSerIncorrecto() {
        // El resultado de restar 90 y 50, multiplicado por 15, NO da 605.
        double rResta = this.calculadora.restar(90, 50);
        double resultado = this.calculadora.multiplicar(rResta, 15);

        Assert.assertNotEquals(605, resultado, 0);
    }

    @Test
    public void item4_deberiaSerIncorrecto() {
        // El resultado de sumar 70 y 40, multiplicado por 25, NO da 2700.
        double rSuma = this.calculadora.sumar(70, 40);
        double resultado = this.calculadora.multiplicar(rSuma, 25);

        Assert.assertNotEquals(2700, resultado, 0);
    }

}
