package SampleClass;

public class Bike {

    String bike_name;
    String Colour;
    String bike_Type;
    String capacity;
    int model;

    public void getBike_details(){
        System.out.println("SampleClass.Bike name is : " + bike_name);
        System.out.println("Colour is : "+ Colour);
        System.out.println("SampleClass.Bike Type is :" + bike_Type);
        System.out.println("SampleClass.Bike engine capacity is : " + capacity);
        System.out.println("Manufacture year : "+ model);
    }

    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.bike_name = "KTM";
        b1.Colour = "Red";
        b1.bike_Type = "Sports";
        b1.capacity = " 350 cc";
        b1.model = 2024;

        Bike b2 = new Bike();
        b2.bike_name = "Honda";
        b2.Colour = "Black";
        b2.bike_Type = "Daily use";
        b2.capacity = " 220 cc";
        b2.model = 2020;

        System.out.println("-----------------------b1 details----------");
        b1.getBike_details();
        System.out.println("-----------------------b2 details----------");
        b2.getBike_details();
    }
}
