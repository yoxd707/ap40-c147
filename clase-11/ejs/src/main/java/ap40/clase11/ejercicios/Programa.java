package ap40.clase11.ejercicios;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class Programa {

    private boolean enEjecucion = false;
    
    @Getter private final Scanner scanner;

    @Getter private Accion accion;
    @Getter @Setter String usuario;


    public Programa() {
        scanner = new Scanner(System.in);
    }


    public void setAccion(Accion accion) {
        accion.setPrograma(this);
        this.accion = accion;
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
