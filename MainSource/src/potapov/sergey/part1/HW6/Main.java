package potapov.sergey.part1.HW6;

import potapov.sergey.part1.HW6.worker.SexEnum;
import potapov.sergey.part1.HW6.worker.Workers;
import potapov.sergey.part1.HW6.worker.workerEngineer;
import potapov.sergey.part1.HW6.workerBase.WorkerBase;

public class Main {
    public static void main(String[] args) {


        WorkerBase workerBase = new WorkerBase();
        Workers worker1 = new Workers();
        workerBase.addWorkerToHashMap(worker1);
        Workers worker2 = new workerEngineer("Vasya",22, SexEnum.MALE);
        worker2.startWorking();
        worker2.stopWorking();

    }
}
