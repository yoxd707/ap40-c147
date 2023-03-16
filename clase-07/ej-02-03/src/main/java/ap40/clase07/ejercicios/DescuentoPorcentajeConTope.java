package ap40.clase07.ejercicios;

public class DescuentoPorcentajeConTope extends Descuento {

    private float tope;

    public DescuentoPorcentajeConTope(float valor, float tope) {
        setValorDesc(valor);
        this.tope = tope;
    }

    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - Math.min(this.tope, (valorInicial * this.getValorDesc()));
    }

}
