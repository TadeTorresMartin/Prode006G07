
import java.util.HashMap;

public class ListaPronostico {
    private HashMap<Integer,pronostico> listapronostico;
    public ListaPronostico(){
        listapronostico = new HashMap<>();
    }

   public void agregarpronostico(pronostico pron){
        listapronostico.put(pron.getKey(),pron);
   }

   public pronostico Buscarpronostico (int key){
       return  listapronostico.get(key);
   }


   public int  cantidadpronosticos(){
        return listapronostico.size();

   }
   public void valuesLista(){
       System.out.println(listapronostico.values());
   }









}
