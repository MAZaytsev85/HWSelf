package HW7;

public class Cat extends Pet {

    public Cat(String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void tell() {
        System.out.printf("%s Мяу\n", name);
    }
}
