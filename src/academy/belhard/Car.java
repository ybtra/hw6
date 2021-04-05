package academy.belhard;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    private int cost;

    public Car(int wheelCount, int doorsCount){
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина");
        System.out.println("Количество дверей: " + doorsCount);
        System.out.println("Количество колес: " + wheelCount);
        System.out.println("Цена: " + getCost());
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost(){
        return cost;
    }
}
