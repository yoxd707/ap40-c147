package ap40.clase10.ejercicios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class InscripcionTest {

    @Test
    public void aprobada_materiaSinCorrelativas() {
        var materia = new Materia();
        materia.setId(0);
        materia.setNombre("Programación I");

        var alumno = new Alumno();
        alumno.setLegajo("000");
        alumno.setNombre("Jorge Prada");

        var inscripcion = new Inscripcion();
        inscripcion.setMateria(materia);
        inscripcion.setAlumno(alumno);

        var resultado = inscripcion.aprobada();

        Assertions.assertTrue(resultado);
    }

    @Test
    public void aprobada_materiaConCorrelativas_correlativasAprobadas() {
        var progI = new Materia();
        progI.setId(0);
        progI.setNombre("Programación I");

        var progII = new Materia();
        progII.setId(1);
        progII.setNombre("Programación II");
        progII.agregarCorrelativa(progI);

        var alumno = new Alumno();
        alumno.setLegajo("000");
        alumno.setNombre("Jorge Prada");
        alumno.agregarAprobada(progI);

        var inscripcion = new Inscripcion();
        inscripcion.setMateria(progII);
        inscripcion.setAlumno(alumno);

        var resultado = inscripcion.aprobada();

        Assertions.assertTrue(resultado);
    }

    @Test
    public void aprobada_materiaConCorrelativas_correlativasNoAprobadas() {
        var progI = new Materia();
        progI.setId(0);
        progI.setNombre("Programación I");

        var progII = new Materia();
        progII.setId(1);
        progII.setNombre("Programación II");
        progII.agregarCorrelativa(progI);

        var alumno = new Alumno();
        alumno.setLegajo("000");
        alumno.setNombre("Jorge Prada");

        var inscripcion = new Inscripcion();
        inscripcion.setMateria(progII);
        inscripcion.setAlumno(alumno);

        var resultado = inscripcion.aprobada();

        Assertions.assertFalse(resultado);
    }

}
