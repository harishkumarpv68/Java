package SampleClass;

public class Bird {
    String name;
    int leg_count;
    String pet_type;
    int age;
    String Colour;

    public void birdDetails(){
        System.out.println("SampleClass.Bird name is : " + name);
        System.out.println("leg count is : "+ leg_count);
        System.out.println("pet type is : " + pet_type);
        System.out.println(name + " age is : " + age);
        System.out.println(name + " colour is : " + Colour);
    }

    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.name = "Parrot";
        b1.leg_count = 2;
        b1.pet_type = "Domestic";
        b1.age = 2;
        b1.Colour = "Green";

        Bird b2 = new Bird();
        b2.name = "Pigeon";
        b2.leg_count = 2;
        b2.pet_type = "Domestic";
        b2.age = 4;
        b2.Colour = "white";

        System.out.println("----------------------b1 details----------");
        b1.birdDetails();
        System.out.println("-----------------------b2 details----------");
        b2.birdDetails();
    }
}

