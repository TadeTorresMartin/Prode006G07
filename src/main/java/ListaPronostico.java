import java.util.HashMap;

public class ListaPronostico {
    private HashMap<Integer,pronostico> listapronostico;
    public ListaPronostico(){
        listapronostico = new HashMap<>();
    }

   public void agregarpronostico(pronostico pron){
        listapronostico.put(pron.getKey(),pron);
   }

   public pronostico mostrarfecha(String fechabuscada){
        return listapronostico.get(fechabuscada);
   }

   public int  cantidadpronosticos(){
        return listapronostico.size();

   }
   public void valuesListaPronostico(){
       System.out.println(listapronostico.values());
   }

   public void recorrerListaPronostico(){
        for (pronostico p : listapronostico.values()){
            System.out.println(p);
        }
   }
   public pronostico getpronostico(int key){
         return listapronostico.get(key);

   }






}
