package ap40.clase07.ejercicios;

public class TablaCsv {

    private final int cantColumnas;
    private final int cantFilas;

    private final String[] encabezado;
    private final String[][] filas;


    public TablaCsv(String[] encabezado, String[][] filas) {
        this.encabezado = encabezado;
        this.filas = filas;

        this.cantColumnas = encabezado.length;
        this.cantFilas = filas.length;
    }


    public int getCantColumnas() {
        return this.cantColumnas;
    }

    public int getCantFilas() {
        return this.cantFilas;
    }

    public String[] getEncabezado() {
        return this.encabezado;
    }

    public String[][] getFilas() {
        return this.filas;
    }

    public String getCelda(int columna, int fila) {
        return this.filas[fila][columna];
    }


    public static TablaCsv parse(String csv) {
        String[] lines = csv.split("\\r?\\n");
        String[] encabezado = lines[0].split(",");
        String[][] filas = new String[lines.length - 1][];

        for (int i = 1; i < lines.length; i++)
            filas[i - 1] = lines[i].split(",");

        return new TablaCsv(encabezado, filas);
    }

}
