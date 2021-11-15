package HW7;

public class Person {


    protected String favoritPet;

    public Person(String favoritPet) {
        System.out.printf("%s Мое любимое животное\n", favoritPet);
        this.favoritPet = favoritPet;
    }
        public String getFavoritPet() {
            return favoritPet;
    }
}

