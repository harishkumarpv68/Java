package SampleClass;

public class Animal {
    String name;
    int leg_count;
    String pet_type;
    int age;
    String Colour;

    public void animalDetails(){
        System.out.println("SampleClass.Animal name is : " + name);
        System.out.println("leg count is : "+ leg_count);
        System.out.println("pet type is : " + pet_type);
        System.out.println(name + " age is : " + age);
        System.out.println(name + " colour is : " + Colour);
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Dog";
        a1.leg_count = 4;
        a1.pet_type = "Domestic";
        a1.age = 4;
        a1.Colour = "Black";

        Animal a2 = new Animal();
        a2.name = "Cat";
        a2.leg_count = 4;
        a2.pet_type = "Domestic";
        a2.age = 2;
        a2.Colour = "white";

        System.out.println("----------------------a1 details----------");
        a1.animalDetails();
        System.out.println("-----------------------a2 details----------");
        a2.animalDetails();
    }
}
