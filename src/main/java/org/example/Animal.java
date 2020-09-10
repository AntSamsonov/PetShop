package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Animal implements IVoice{
    protected final String name;
    protected int age;
    protected double price;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void voice(byte canFood);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
