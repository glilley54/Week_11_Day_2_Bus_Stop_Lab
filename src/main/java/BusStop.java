import java.util.ArrayList;

public class BusStop {
    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name){
        this.queue = new ArrayList<>();
        this.name = name;
    }










    public int queueCheck() {
        return this.queue.size();
    }
}
