import java.util.HashMap;

public class ListaPartido {

    // Creacion de Hashmap para guardar las fechas
    private HashMap<Float, Partido> listaPartidos;
    public ListaPartido(){
        listaPartidos = new HashMap<>();
    }

    // Agregar partido al mapa
    public void agregarPartido(Partido partido){
        listaPartidos.put(partido.getFecha(), partido);
        
    }

    // Saber cantidad de partidos
    public int cantidadPartidos(){
        return listaPartidos.size();
    }

    // Devolver cada partido
    public void valuesListaPartido(){
        System.out.println(listaPartidos.values());
    }
//poner un metodo

    public Partido buscarPartido(double fecha){
        return listaPartidos.get(fecha);
    }
}