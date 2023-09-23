package Polymorphism;

public class Animal {

    private String name;

    public void makeSound(String x) {
        System.out.println("Default Sound");
        name = x;
    }
    
}

class Dog extends Animal {

    @Override
    public void makeSound(String x) {
        System.out.println(x+" is dog it voice Woof Woof");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound(String x) {
        System.out.println(x+ " is cat it voice Meow Meow");
    }
}

class MainMethods {

    public static void main(String[] args) {
        Animal Hewan = new Animal();
        Dog Anjing = new Dog();
        Cat Kucing = new Cat();
        Hewan.makeSound("animal");
        Anjing.makeSound("yeontan");
        Kucing.makeSound("Muezza");
    }

}
