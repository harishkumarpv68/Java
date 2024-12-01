package SampleInterfaces;

interface Vehicle {
    void start();
    void stop();
}

abstract public class Bike implements Vehicle {

        public void start() {
            System.out.println("Bike is starting.");
        }

        public abstract void stop();
    }


class ElectricBike extends Bike {
        @Override
        public void stop() {
            System.out.println("Electric bike is stopping.");
        }

    public static void main(String[] args) {
        ElectricBike b = new ElectricBike();

        b.start();
        b.stop();

    }

}


