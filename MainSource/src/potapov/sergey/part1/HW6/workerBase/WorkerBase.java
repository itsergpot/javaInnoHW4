package potapov.sergey.part1.HW6.workerBase;

import potapov.sergey.part1.HW6.worker.Workers;

import java.util.HashMap;

public class WorkerBase {

    HashMap<String, Workers> workersHashMap = new HashMap<>();

    public void addWorkerToHashMap(Workers worker){
        workersHashMap.put(worker.getName(), worker);
    }

    public Workers getWorkerFromHashMap(String worker){
        return workersHashMap.get(worker);
    }
}
