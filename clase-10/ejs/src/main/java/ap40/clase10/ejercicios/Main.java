package ap40.clase10.ejercicios;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

import com.opencsv.bean.CsvToBeanBuilder;

public class Main {

    private static HashMap<Integer, Materia> materias = new HashMap<Integer, Materia>();
    private static HashMap<String, Alumno> alumnos = new HashMap<String, Alumno>();

    public static void main(String[] args) {

        try {
            // Materias
            var materias = new CsvToBeanBuilder<Materia>(new FileReader(args[0]))
                .withType(Materia.class)
                .build()
                .parse();

            for (var materia : materias)
                Main.materias.put(materia.getId(), materia);

            for (var materia : materias) {
                for (Integer materiaId : materia.getCorrelativasPorIds()) {
                    Materia correlativa = Main.materias.getOrDefault(materiaId, null);

                    if (correlativa == null) continue;

                    materia.agregarCorrelativa(correlativa);
                }
            }

            // Alumnos
            var alumnos = new CsvToBeanBuilder<Alumno>(new FileReader(args[1]))
                .withType(Alumno.class)
                .build()
                .parse();

            for (var alumno : alumnos) {
                for (Integer materiaId : alumno.getMateriasAprobadasPorIds()) {
                    Materia aprobada = Main.materias.getOrDefault(materiaId, null);

                    if (aprobada == null) continue;

                    alumno.agregarAprobada(aprobada);
                }

                Main.alumnos.put(alumno.getLegajo(), alumno);
            }

            var inscripciones = new CsvToBeanBuilder<Inscripcion>(new FileReader(args[2]))
                .withType(Inscripcion.class)
                .build()
                .parse();

            Files.writeString(Paths.get(args[3]), "legajo, alumno, materia id, materia nombre, estado de la inscripción");

            for (var inscripcion : inscripciones) {
                var alumno = Main.alumnos.getOrDefault(inscripcion.getAlumnoLegajo(), null);
                var materia = Main.materias.getOrDefault(inscripcion.getMateriaId(), null);
                
                var error = "";
                var linea = inscripcion.getAlumnoLegajo();
                linea += ", ";

                if (alumno == null) {
                    error = "No existe el/la alumno/a";
                }
                else {
                    inscripcion.setAlumno(alumno);
                    linea += alumno.getNombre();
                }

                linea += ", " + inscripcion.getMateriaId();
                linea += ", ";

                if (materia == null) {
                    if (error.length() > 0)
                        error += ". ";

                    error += "No existe la materia";
                }
                else {
                    inscripcion.setMateria(materia);
                    linea += materia.getNombre();
                }

                linea += ", ";

                if (alumno != null && materia != null)
                    linea += (inscripcion.aprobada() ? "Aprobada" : "Rechazada");
                else
                    linea += error;

                Files.writeString(Paths.get(args[3]), "\n" + linea, StandardOpenOption.APPEND);
            }
        }
        catch (Exception ex) {

        }

    }

}
