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
            String key = rs2.getString("key");
            int documento = rs2.getInt("documento");
            String fecha = rs2.getString("fecha");
            String equipoganador = rs2.getString("equipoganador");
            String empate = rs2.getString("empate");
            pronostico pron = new pronostico(key,documento,fecha,equipoganador,empate);
            listapronostico.agregarpronostico(pron);
            System.out.println(pron);

        }
        st2.close();
        rs2.close();



    }
}