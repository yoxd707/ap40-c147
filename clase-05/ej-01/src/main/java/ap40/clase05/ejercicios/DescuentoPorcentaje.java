package ap40.clase05.ejercicios;

public class DescuentoPorcentaje extends Descuento {

    public DescuentoPorcentaje(float valor) {
        setValorDesc(valor);
    }

    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - (valorInicial * this.getValorDesc());
    }

}
