import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter


public class pronostico {
    String key;
    int documento;
    String fecha;
    String equipoganador;
    String empate;



    public  pronostico(String key, int documento,String fecha,String equipoganador,String empate){
        this.key = key;
        this.documento = documento;
        this.fecha = fecha;
        this.equipoganador = equipoganador;
        this.empate = empate;
    }
    public String toString() {
        if (empate == null){
            return  "user:  " + documento + ", "
                    +  "fecha: " + fecha + " aposto ganador por el equipo: " + equipoganador;


        }
        else {
            return "user: " + documento + ", fecha: " + fecha + ": apostó al empate";

        }
    }

}



