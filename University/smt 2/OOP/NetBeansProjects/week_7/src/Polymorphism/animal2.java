package Polymorphism;

public class animal2 {

    private String name;

    public makeSound(String x) {
         name  = x;
    }
    public void makeSound(String x){
        this.name=x;
        System.out.println(x +" is  Default Sound");
    }
    
}

class Dog extends animal2 {

    @Override 
    public String setname() {
        return name;
    }
    public void makeSound(String x){
        this.name=x;
        System.out.println(x+" is dog it voice Woof Woof");
    }
    
}

class Cat extends animal2 {

    @Override
    public void makeSound(String x) {
        System.out.println(x+ "is cat it voice Meow Meow");
    }
}

class MainMethods {

    public static void main(String[] args) {
        animal2 Hewan = new animal2();
        Dog Anjing = new Dog();
        Cat Kucing = new Cat();
        Hewan.makeSound("Oii");
        Hewan.setname();
        Anjing.makeSound("irwan");
        Kucing.makeSound("Muezza");
    }

}
