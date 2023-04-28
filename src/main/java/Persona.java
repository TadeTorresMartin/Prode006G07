import lombok.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
@Getter @Setter
public class Persona {

    private String nombre;
    private String apellido;
    private int documento;

    private int puntos;


    public Persona(int documento,String nombre, String apellido, int puntos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.puntos = puntos;
    }

    // Metodo para leer archivo
    public void sumarPuntos(){
        puntos++;
    }




    }
