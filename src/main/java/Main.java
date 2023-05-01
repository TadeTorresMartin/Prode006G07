import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.*;
public class Main {



    public static void main(String[] args) throws IOException, SQLException {

        System.out.println("Bienvenido al Prode del grupo 007 de Argentina Programa! ");
        System.out.println("cuanto puntos quiere que valga un acierto?:  ");

        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        Pattern ValidarN = Pattern.compile("[0-9]{0,10}");
        boolean validacionNum = ValidarN.matcher(n).matches();

        if (!validacionNum){
            System.out.println("eligio un caracter incorrecto");
        }

       int numValidado = Integer.parseInt(n);



        ListaPartido listaPartido = new ListaPartido();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pronosticos", "root", "@Verne123");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from tablaprode");
        while (rs.next()) {
            double fechaPronostico = rs.getDouble("fecha");
            String equipo1 = rs.getString("equipo1");
            int golEquipo1 = rs.getInt("golesequipo1");
            String equipo2 = rs.getString("equipo2");
            int golEquipo2 = rs.getInt("golesequipo2");
            Partido p = new Partido(fechaPronostico, equipo1, golEquipo1, equipo2, golEquipo2);
            listaPartido.agregarPartido(p);




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


        int mayorPuntaje = 0;
        int docmayorPuntaje = 0;
        for(int i=1; i<= listapronostico.cantidadpronosticos();i++) {
            pronostico pron = listapronostico.Buscarpronostico(i);
            int documentoPron = pron.getDocumento();
            String equipoganadorPron = pron.getEquipoganador();
            double fechaPron = pron.getFecha();
            Partido ganadorPartido = listaPartido.buscarGanador(fechaPron);
            String StrganadorPartido = String.valueOf(ganadorPartido);
            if (StrganadorPartido.equals(equipoganadorPron)) {
                Persona personaAcerto = listapersonas.Buscapersona(documentoPron);
                int posibleGanador = personaAcerto.sumarPuntos(numValidado);
                if (posibleGanador > mayorPuntaje){
                   mayorPuntaje = posibleGanador;
                    docmayorPuntaje = documentoPron;
                }

            }


        }
        System.out.println(" ¡GANADOR ACTUAL DEL PRODE!");
        System.out.println(listapersonas.Buscapersona(docmayorPuntaje));

        System.out.println("LISTA DE PARTICIPANTES Y PUNTAJES: ");
        listapersonas.valuesListaPersonas();

        sc.close();















    }













    }
