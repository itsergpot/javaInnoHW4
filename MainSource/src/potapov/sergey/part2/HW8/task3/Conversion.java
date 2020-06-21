package potapov.sergey.part2.HW8.task3;

public class Conversion {

    public static Act conversionFromContractToAct(Contract contract){
        return new Act(contract.numberOfDoc, contract.date, contract.productList);
    }
}
