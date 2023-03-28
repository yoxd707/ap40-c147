package ap40.clase10.ejercicios;

import java.util.Collection;
import java.util.LinkedList;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Materia {

    @Getter @Setter @CsvBindByName
    private int id;

    @Getter @Setter @CsvBindByName
    private String nombre;

    @Getter @CsvBindAndSplitByName(elementType = Integer.class, column = "correlativas")
    private Collection<Integer> correlativasPorIds;

    @Getter
    private Collection<Materia> correlativas = new LinkedList<Materia>();


    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }

    public boolean puedeCursar(Alumno alumno) {
        return alumno.getMateriasAprobadas().containsAll(correlativas);
    }

}
