package potapov.sergey.part1.HW6;

import potapov.sergey.part1.HW6.worker.SexEnum;
import potapov.sergey.part1.HW6.worker.WorkerEngineer;
import potapov.sergey.part1.HW6.workerBase.WorkerBase;

public class Main {
    public static void main(String[] args) {


        WorkerBase workerBase = new WorkerBase();
        WorkerEngineer worker = new WorkerEngineer("Vasya",22, SexEnum.MALE);
        workerBase.addWorkerToHashMap(worker);
        worker.startWorking();
        worker.stopWorking();
        worker.repairMechanism("Some stuff");

    }
}
