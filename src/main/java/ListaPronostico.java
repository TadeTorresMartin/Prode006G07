import java.util.HashMap;

public class ListaPronostico {
    private HashMap<Integer,pronostico> listapronostico;
    public ListaPronostico(){
        listapronostico = new HashMap<>();
    }

   public void agregarpronostico(pronostico pron){
        listapronostico.put(pron.getDocumento(),pron);
   }
}
