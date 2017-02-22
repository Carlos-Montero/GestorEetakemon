/**
 * Created by Carlos on 22/02/2017.
 */
public class Eetakemon {

    public String name;
    public int id;
    public int level;

    public Eetakemon(){}

    public Eetakemon (String name, int id, int level){
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

