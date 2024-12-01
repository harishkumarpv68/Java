package SampleClass;

public class Mobile {

    String Device_name;
    String Colour;
    int Android_version;
    int Storage;
    float Screen_size;

    public void getMobile_details(){
        System.out.println("Device_name is : " + Device_name);
        System.out.println("Colour is : "+ Colour);
        System.out.println("Android_version is :" + Android_version);
        System.out.println("Storage is : " + Storage);
        System.out.println("Screen_size is : "+ Screen_size);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.Device_name = "Motog32";
        m1.Colour = "Black";
        m1.Android_version = 13;
        m1.Storage = 128;
        m1.Screen_size = 6.8f;

        Mobile m2 = new Mobile();
        m2.Device_name = "Y2";
        m2.Colour = "Gold";
        m2.Android_version = 13;
        m2.Storage = 32;
        m2.Screen_size = 6.2f;

        System.out.println("-----------------------m1 details----------");
        m1.getMobile_details();
        System.out.println("-----------------------m2 details----------");
        m2.getMobile_details();
    }
}
