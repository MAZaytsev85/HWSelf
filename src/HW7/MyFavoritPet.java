package HW7;

public class MyFavoritPet {
    public static void main(String[] args) {
        Person men = new Person("Dog");
        Pet dog = new Dog("Шарик", "Черный", 3);
        Pet cat = new Cat("Мурка", "Белый", 7);

//        Person[] persArr = new Person[2];
//        persArr[0] = new Person("Cat");
//        for (Person pers : persArr) {
//            if (pers.getFavoritPet() == "Dog") dog.tell();
//            else if (pers.getFavoritPet() == "Cat") cat.tell();


            if (men.getFavoritPet() == "Dog") dog.tell();
            else if (men.getFavoritPet() == "Cat") cat.tell();

    }
}
