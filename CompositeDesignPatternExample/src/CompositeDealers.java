import java.util.ArrayList;
import java.util.List;

public class CompositeDealers extends Worker{
    private List<Worker> workerList;

    public CompositeDealers() {

        workerList = new ArrayList<Worker>();
    }
    public void add(Worker worker){
        workerList.add(worker);
    }
    @Override
    public int getMaas() {
        int result = 0;
        for(Worker worker : workerList){
            result += worker.getMaas();
        }
        return result;
    }
}
