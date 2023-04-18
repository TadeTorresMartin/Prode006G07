import lombok.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
@Getter @Setter
public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodo para leer archivo
    public  void  Pronostico() throws IOException {
        Path pronosticoPersona = Paths.get("ejemplo.txt");
        Scanner scPronostico =  new Scanner(pronosticoPersona);
        while(scPronostico.hasNext()){
            //opero con el archivo, seguramente algo parecido a como se opera en el main con los partidos
        }

        scPronostico.close();
    }
}