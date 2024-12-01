package SampleClass;

public class Laptop {

    String laptop_name;
    String Colour;
    String OS;
    String Storage;
    float Screen_size;

    public void getLaptop_details(){
        System.out.println("Device_name is : " + laptop_name);
        System.out.println("Colour is : "+ Colour);
        System.out.println("Operating System is :" + OS);
        System.out.println("Storage is : " + Storage);
        System.out.println("Screen_size is : "+ Screen_size);
    }

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.laptop_name = "Lenovo";
        l1.Colour = "Black";
        l1.OS = "Windows";
        l1.Storage = "1TB";
        l1.Screen_size = 15.5f;

        Laptop l2 = new Laptop();
        l2.laptop_name = "HP";
        l2.Colour = "White";
        l2.OS = "Linux";
        l2.Storage = "2TB";
        l2.Screen_size = 14.5f;


        System.out.println("-----------------------l1 details----------");
        l1.getLaptop_details();
        System.out.println("-----------------------l2 details----------");
        l2.getLaptop_details();
    }
}
