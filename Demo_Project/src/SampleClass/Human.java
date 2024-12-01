package SampleClass;

public class Human {

    String name;
    char gender;
    String place;
    int age;
    float height;


    public void getAge(){
        System.out.println("Age is : " + age);
    }

    public void getHeight(){
        System.out.println("Height is : " + height);
    }

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Smith";
        h1.gender = 'M';
        h1.place = "BLR";
        h1.age = 28;
        h1.height = 5.8f;

        h1.getAge();
        h1.getHeight();

    }
}
