import java.io.IOException;
import java.sql.*;

public class Main {
  public static void main(String[] args) throws IOException, SQLException {
      Listas listaPartidos = new Listas();
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prode","root","@Verne123");
      System.out.println(" se conectó");
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("select * from tablaprode");
      while (rs.next()){
          int fecha = rs.getInt("fecha");
         String equipo1 =   rs.getString("nomEquipo1");
          int golEquipo1  = rs.getInt("golEquipo1");
         String equipo2 =  rs.getString("nomEquipo2");
          int golEquipo2 = rs.getInt("golEquipo2");
          Partido p =  new Partido(fecha,equipo1,golEquipo1,equipo2,golEquipo2);
          listaPartidos.agregarPartido(p);
          System.out.println(p);

      }
      rs.close();
      conn.close();
      System.out.println("la cantidad de partidos jugados fueron: " + listaPartidos.cantidadPartidos());
      listaPartidos.recorrerListaPartido();





  }
}