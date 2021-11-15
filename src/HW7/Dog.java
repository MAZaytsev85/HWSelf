package HW7;

public class Dog extends Pet {

    public Dog(String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void tell() {
        System.out.printf("%s Гав\n", name);
    }
}
