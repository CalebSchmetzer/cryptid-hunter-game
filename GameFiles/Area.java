import java.util.Queue;
import java.util.LinkedList;

public class Area {
    private String name;
    private String description;
    private Queue < Cryptid > encounterQ; // Holds all Cryptids in the area

    public Area(String name, String description) {
        this.name = name;
        this.description = description;
        this.encounterQ = new LinkedList < > ();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addCryptid(Cryptid cryptid) {
        encounterQ.offer(cryptid);
    }

    public Queue < Cryptid > getQueue() {
        return encounterQ;
    }
}
