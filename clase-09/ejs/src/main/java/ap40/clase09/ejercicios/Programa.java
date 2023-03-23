package ap40.clase09.ejercicios;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class Programa {

    @Getter private final Scanner scanner;
    @Getter private final List<Persona> listadoPersonas;

    private boolean enEjecucion = false;

    @Getter @Setter private Accion accion;


    public Programa() {
        scanner = new Scanner(System.in);
        listadoPersonas = new LinkedList<Persona>();
    }


    public void Iniciar() {
        if (accion == null) return;

        enEjecucion = true;

        while (enEjecucion) accion.EjecutarAccion();
    }

    public void Detener() {
        enEjecucion = false;
    }


    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

}
