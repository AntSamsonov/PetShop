package org.example;

public class PetShop {
    private Animal dog = new Dog("Rex", 4);
    private Animal cat = new Cat("Murzik", 2);

    public PetShop(){
        System.out.println("Welcome to out 'Pet Shop'");
        System.out.println("We have one cat and one dog");
    }

    public Animal getAnimal(AnimalType type){
        switch (type){
            case CAT:
                return cat;
            case DOG:
                return dog;
            default :
                throw new RuntimeException("Unknown type of animal");
        }
    }

    public void sell(Man man, Animal pet){
        if (pet instanceof Dog && man.getMoney() >= dog.getPrice()){
            this.dog = null;
            System.out.println("You bought a cat");
        }
        if (pet instanceof Cat && man.getMoney() >= cat.getPrice()){
            this.cat = null;
            System.out.println("You bought a dog");
        } else {
            System.out.println("Not enough money");
        }
    }

}
