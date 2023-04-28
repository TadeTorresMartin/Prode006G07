import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter


public class pronostico {
    int  key;
    int documento;
    double fecha;
    String equipoganador;




    public  pronostico(int key, int documento,double fecha,String equipoganador){
        this.key = key;
        this.documento = documento;
        this.fecha = fecha;
        this.equipoganador = equipoganador;

    }
    public String toString() {
        return "a";
    }

}



