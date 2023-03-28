package ap40.clase10.ejercicios;

import com.opencsv.bean.CsvBindByName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Inscripcion {

    @Getter @CsvBindByName(column = "legajo")
    private String alumnoLegajo;

    @Getter @CsvBindByName(column = "materia")
    private Integer materiaId;

    @Getter @Setter
    private Alumno alumno;

    @Getter @Setter
    private Materia materia;


    public boolean aprobada() {
        return materia.puedeCursar(alumno);
    }

}
