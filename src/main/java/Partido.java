import lombok.*;

@Getter @Setter
public class Partido {


    private String equipo1;
    private String equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private double fecha;

    // Constructor con todos los parametros
    public Partido(double fecha,String equipo1, int golesEquipo1, String equipo2, int golesEquipo2) {
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.golesEquipo1 = golesEquipo1;
        this.equipo2 = equipo2;
        this.golesEquipo2 = golesEquipo2;

    }



    public String toString (){
        if (golesEquipo1 > golesEquipo2){
            return equipo1;
        }
        if (golesEquipo1 == golesEquipo2){
            return "empate";
        }
        else return equipo2;



    }


}