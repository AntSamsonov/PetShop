package org.example;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        Man man = new Man("John Connor", 42);

        Animal cat = shop.getAnimal(AnimalType.CAT);
        Animal dog = shop.getAnimal(AnimalType.DOG);

        //man.buyPet(cat);
        System.out.println(cat.getName());
        cat.setAge(5);
        System.out.println();
    }
}
