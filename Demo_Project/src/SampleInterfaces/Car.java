package SampleInterfaces;

interface Engine {
    void startEngine();
    void stopEngine();
    void checkEngineStatus();
}

interface Fuel {
    void checkFuelLevel();
    void refuel();
    void monitorFuelConsumption();
}
public class Car implements  Engine,Fuel{

    public void startEngine() {
        System.out.println("Engine is started");
    }

    public void stopEngine() {
        System.out.println("Engine is stopped");
    }

    public void checkEngineStatus() {
        System.out.println("Engine is in good condition");
    }


    public void checkFuelLevel() {
        System.out.println("Checking fuel level");
    }

    public void refuel() {
        System.out.println("Refueling the vehicle");
    }

    public void monitorFuelConsumption() {
        System.out.println("Monitoring fuel consumption");
    }

}

