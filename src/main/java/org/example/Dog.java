package org.example;

public class Dog extends Animal{
    private int price;

    public Dog(String name, int age) {
        super(name, age);
    }

    public void voice() {
        System.out.println("Wuf wuf");
    }

    public void voice(byte dogFood){
        if (dogFood < 5){
            voice();
        } else {
            System.out.println(".......");
        }
    }

     @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
