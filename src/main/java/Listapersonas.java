import java.util.HashMap;

public class Listapersonas {
    private HashMap<Integer,Persona> listapersonas;
    public Listapersonas(){
        listapersonas = new HashMap<>();
    }


    public void agregarPersona(Persona pers){
        listapersonas.put(pers.getDocumento(),pers);
    }
    public Persona Buscapersona(int documento){
        return listapersonas.get(documento);
    }
    public int cantidadlistaPersonas(){
        return listapersonas.size();
    }

    public void valuesListaPersonas(){
        System.out.println(listapersonas.values());

    }









}
