package ap40.clase10.ejercicios;

import java.util.Collection;
import java.util.LinkedList;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Alumno {

    @Getter @Setter @CsvBindByName
    private String nombre;

    @Getter @Setter @CsvBindByName
    private String legajo;

    @Getter @CsvBindAndSplitByName(elementType = Integer.class, column = "materiasAprobadas")
    private Collection<Integer> materiasAprobadasPorIds;

    @Getter
    private Collection<Materia> materiasAprobadas = new LinkedList<Materia>();


    public void agregarAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

}
