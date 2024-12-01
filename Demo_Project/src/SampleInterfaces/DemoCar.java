package SampleInterfaces;

public class DemoCar {

    public static void main(String[] args) {

        Car c = new Car();
        c.startEngine();
        c.stopEngine();
        c.checkEngineStatus();

        c.checkFuelLevel();
        c.refuel();
        c.monitorFuelConsumption();
    }
}
