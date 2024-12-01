package SampleInterfaces;

interface Vehicle2 {
    void start();
    void stop();
}

interface ElectricVehicle extends Vehicle2 {
    void charge();
}


public class DemoMultipleInterface implements ElectricVehicle {

    public void start() {
        System.out.println("Electric car is start");
    }

    public void stop() {
        System.out.println("Electric car is stop");
    }

    public void charge() {
        System.out.println("Electric car is charging");
    }

    public static void main(String[] args) {

        DemoMultipleInterface a = new DemoMultipleInterface();
                a.start();
                a.stop();
                a.charge();
    }
}
