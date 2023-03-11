package ap40.clase05.ejercicios;

public class DescuentoFijo extends Descuento {

    public DescuentoFijo(float valor) {
        setValorDesc(valor);
    }

    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - this.getValorDesc();
    }

}
