import lombok.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
@Getter @Setter
public class Persona {

    private String nombre;
    private String apellido;
    private float documento;


    public Persona(String nombre, String apellido, float documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    // Metodo para leer archivo



    }
