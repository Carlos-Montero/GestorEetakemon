import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos on 22/02/2017.
 */
public class Controller {

    public List<Eetakemon> lista;

    public Controller(){

        lista = new ArrayList<Eetakemon>();
    }
    private int currentID;


    public Eetakemon getEetakemonById (int id) {

        if (id < currentID){
            return lista.get(id);
        }
        else{
            return null;
        }
    }

    public int counter (){     //obtain current ID counter
        return currentID;
    }

    public void addEetakemon (Eetakemon e){  //add Eetakemon

        lista.add(e);
        currentID++;
    }

    public int deleteEetakemonByID(int id){ //delete Eetakemon by ID

        int found=0;  //0 si no lo encuentra
        for (int i=0;i < lista.size(); i++){

            if(lista.get(i).getId()== id){

                found = 1; //si lo encuentra
                lista.remove(i);
            }
        }
        return found;

    }

    public List<Eetakemon> showAll(){  //return current Eetakemon list

        return lista;
    }

    public List<Eetakemon> findEetakemon(String name){  //obtain all Eetakemon with this name
        List<Eetakemon> resultslist = new ArrayList<Eetakemon>();
        for (int i=0; i < lista.size(); i++){
            Eetakemon e = lista.get(i);
            if(e.getName().equals(name)){
                resultslist.add(e);
            }
        }

        return resultslist;

    }
}






