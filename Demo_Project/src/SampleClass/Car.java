package SampleClass;

public class Car {
    String car_name;
    String Colour;
    String car_Type;
    int seats;
    int model;

    public void getCar_details(){
        System.out.println("car name is : " + car_name);
        System.out.println("Colour is : "+ Colour);
        System.out.println("SampleClass.Car Type is :" + car_Type);
        System.out.println("Number of seats is : " + seats);
        System.out.println("Manufacture year : "+ model);
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.car_name = "Audi";
        c1.Colour = "Black";
        c1.car_Type = "Petrol";
        c1.seats = 4;
        c1.model = 2023;

        Car c2 = new Car();
        c2.car_name = "Toyota";
        c2.Colour = "White";
        c2.car_Type = "Diesel";
        c2.seats = 7;
        c2.model = 2024;

        System.out.println("-----------------------C1 details----------");
        c1.getCar_details();
        System.out.println("-----------------------C2 details----------");
        c2.getCar_details();
    }

}
