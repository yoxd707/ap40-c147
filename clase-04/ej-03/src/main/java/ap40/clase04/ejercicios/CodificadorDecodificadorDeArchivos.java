package ap40.clase04.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CodificadorDecodificadorDeArchivos {

    public static void codificarArchivo(String dirEntrada, String dirSalida, int desplazamiento) throws IOException {
        String entrada = Files.readString(Paths.get(dirEntrada).toAbsolutePath());
        String datosCodificados = CodificadorDecodificador.codificar(entrada, desplazamiento);
        Files.writeString(Paths.get(dirSalida).toAbsolutePath(), datosCodificados);
    }

    public static void decodificarArchivo(String dirEntrada, String dirSalida, int desplazamiento) throws IOException {
        String entrada = Files.readString(Paths.get(dirEntrada).toAbsolutePath());
        String datosDecodificados = CodificadorDecodificador.decodificar(entrada, desplazamiento);
        Files.writeString(Paths.get(dirSalida).toAbsolutePath(), datosDecodificados);
    }

}
