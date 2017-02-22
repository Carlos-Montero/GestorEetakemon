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

    public void addEetakemon (Eetakemon e){  //add Eetakemon
        lista.add(e);
    }

    public void deleteEetakemonByID(int id){ //delete Eetakemon by ID


    }

    public List<Eetakemon> showAll(){  //return current Eetakemon list
        return lista;
    }

    public List<Eetakemon> showOnlyEetakemonWithName() {//return the Eetakemon with a certain name

    }




}
