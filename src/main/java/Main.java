import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        ListaPartido listaresultado = new ListaPartido();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pronosticos", "root", "@Verne123");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from tablaprode");
        while (rs.next()) {
            float fechaPronostico = rs.getFloat("fecha");
            String equipo1 = rs.getString("equipo1");
            int golEquipo1 = rs.getInt("golesequipo1");
            String equipo2 = rs.getString("equipo2");
            int golEquipo2 = rs.getInt("golesequipo2");
            Partido p = new Partido(fechaPronostico, equipo1, golEquipo1, equipo2, golEquipo2);
            listaresultado.agregarPartido(p);



        }

        st.close();
        rs.close();

        Statement st2 = conn.createStatement();
        ResultSet rs2 = st2.executeQuery("select * from pronosticopersona");
        ListaPronostico listapronostico = new ListaPronostico();
        while (rs2.next()) {
            int key = rs2.getInt("key");
            int documento = rs2.getInt("documento");
            double fecha = rs2.getDouble("fecha");
            String equipoganador = rs2.getString("equipoganador");
            pronostico pron = new pronostico(key,documento,fecha,equipoganador);
            listapronostico.agregarpronostico(pron);



        }



        st2.close();
        rs2.close();

        Statement st3 = conn.createStatement();
        ResultSet rs3 = st3.executeQuery("select * from datospersona");
        Listapersonas listapersonas = new Listapersonas();
        while (rs3.next()){
            int documento = rs3.getInt("documento");
            String nombre = rs3.getString("nombre");
            String apellido = rs3.getString("apellido");
            Persona pers = new Persona(documento,nombre,apellido,0);
            listapersonas.agregarPersona(pers);

        }
        st3.close();
        rs3.close();


        for(int i= 0; i<listapronostico.cantidadpronosticos();i++){

        }


        listapronostico.getpronostico(1);
        listaresultado.buscarPartido(1.1);









    }
}