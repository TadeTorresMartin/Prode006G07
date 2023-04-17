import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Lecturas{

    // Método para escanear

    public void scannerPartidos() throws IOException{

        Listas listaPartido = new Listas();

        // Lectura de archivo
        Path archivoPartido = Paths.get("partidos.txt");

        // Creacion de escaner que lee el archivo
        Scanner scPartido = new Scanner(archivoPartido);
        scPartido.useLocale(Locale.forLanguageTag("es-AR"));

        // Cambio de delimiter para el scaner
        scPartido.useDelimiter("[;,\\n\\r]+");

        // Loop principal para crear el partido
        while (scPartido.hasNextInt()){

            int fecha = scPartido.nextInt();
            String equipo1 = scPartido.next();
            int golesEquipo1 = scPartido.nextInt();
            String equipo2 = scPartido.next();
            int golesEquipo2 = scPartido.nextInt();

            // Crea una variable temporal para crear el objeto
            Partido partido = new Partido(fecha, equipo1, golesEquipo1, equipo2, golesEquipo2);
            listaPartido.agregarPartido(partido);

            System.out.println(listaPartido.cantidadPartidos());
            listaPartido.recorrerListaPartido();
        }

        scPartido.close();

    }

}