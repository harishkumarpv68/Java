package SampleClass;

public class TV {
    String TV_name;
    String Colour;
    String Screen_Type;
    String Resolution;
    int Screen_size;

    public void getTV_details(){
        System.out.println("TV_name is : " + TV_name);
        System.out.println("Colour is : "+ Colour);
        System.out.println("Screen Type is :" + Screen_Type);
        System.out.println("Resolution is : " + Resolution);
        System.out.println("Screen_size is : "+ Screen_size);
    }

    public static void main(String[] args) {

        TV T1 = new TV();
        T1.TV_name = "Sony";
        T1.Colour = "Black";
        T1.Screen_Type = "OLED";
        T1.Resolution = "2160p";
        T1.Screen_size = 32;

        TV T2 = new TV();
        T2.TV_name = "Samsung";
        T2.Colour = "White";
        T2.Screen_Type = "QLED";
        T2.Resolution = "1080p";
        T2.Screen_size = 64;

        System.out.println("-----------------------T1 details----------");
        T1.getTV_details();
        System.out.println("-----------------------T2 details----------");
        T2.getTV_details();
    }
}
