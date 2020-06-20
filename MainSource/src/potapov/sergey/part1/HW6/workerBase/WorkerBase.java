package potapov.sergey.part1.HW6.workerBase;

import potapov.sergey.part1.HW6.worker.AbstractWorker;

import java.util.HashMap;

public class WorkerBase {

    private final HashMap<String, AbstractWorker> workersHashMap = new HashMap<>();

    public void addWorkerToHashMap(AbstractWorker worker){
        workersHashMap.put(worker.getName(), worker);
    }

    public AbstractWorker getWorkerFromHashMap(String worker){
        return workersHashMap.get(worker);
    }
}
