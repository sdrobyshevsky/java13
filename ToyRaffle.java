public class ToyRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор", 30, 20);
        Toy toy2 = new Toy(2, "Мишка Тедди", 100, 40);
        Toy toy3 = new Toy(3, "Робот", 100, 90);
        Toy toy4 = new Toy(3, "Футбольный мяч", 20, 30);
        Toy toy5 = new Toy(3, "Кукла", 100, 90);
        Toy toy6 = new Toy(3, "Гоночная машинка на радиоуправлении", 60, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}