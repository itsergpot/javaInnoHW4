package potapov.sergey.part1.HW7;

public enum GoodsListEnum {
    FANTA(15, "Фанта", 1),
    COCA_COLA(15,"Кока-кола",2),
    SPRITE(15,"Спрайт",3),
    WATER(5,"Вода",4),
    SPARKLING_WATER(8,"Газированная вода",5),
    JUICE(20,"Сок",6);

    int cost;
    String name;
    int serial_number;

    GoodsListEnum(int cost, String name, int serial_number){
        this.cost = cost;
        this.name = name;
        this.serial_number = serial_number;
    }

    public static void printAllGoods(){
        for (GoodsListEnum list: GoodsListEnum.values()
             ) {
            System.out.println(list.name + " - " + list.cost + " рублей." +
                    " Порядковый номер: " + list.serial_number);
        }
    }
}
