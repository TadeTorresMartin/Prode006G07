import lombok.*;

import java.util.HashMap;

@Getter @Setter
public class Partido {


    private String equipo1;
    private String equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private float fecha;

    // Constructor con todos los parametros
    public Partido(float fecha,String equipo1, int golesEquipo1, String equipo2, int golesEquipo2) {
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.golesEquipo1 = golesEquipo1;
        this.equipo2 = equipo2;
        this.golesEquipo2 = golesEquipo2;

    }

    public String toString (){
        return fecha + " " + equipo1 + " " + golesEquipo1 + " - " + equipo2  + " " +  golesEquipo2;

    }


}