package academy.belhard;

public class Motorcycle extends Vehicle{
    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed){
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл");
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Количество колес: " + wheelCount);
    }
}
