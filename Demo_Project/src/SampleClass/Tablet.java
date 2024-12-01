package SampleClass;

public class Tablet {
    String Device_name;
    String Colour;
    int version;
    int Storage;
    float Screen_size;

    public void getTablet_details(){
        System.out.println("Device_name is : " + Device_name);
        System.out.println("Colour is : "+ Colour);
        System.out.println("version is :" + version);
        System.out.println("Storage is : " + Storage);
        System.out.println("Screen_size is : "+ Screen_size);
    }

    public static void main(String[] args) {
        Tablet m1 = new Tablet();
        m1.Device_name = "Samsung";
        m1.Colour = "Black";
        m1.version = 7;
        m1.Storage = 128;
        m1.Screen_size = 8.5f;

        Tablet m2 = new Tablet();
        m2.Device_name = "Apple";
        m2.Colour = "Gold";
        m2.version = 6;
        m2.Storage = 256;
        m2.Screen_size = 8.2f;

        System.out.println("-----------------------m1 details----------");
        m1.getTablet_details();
        System.out.println("-----------------------m2 details----------");
        m2.getTablet_details();
    }
}
