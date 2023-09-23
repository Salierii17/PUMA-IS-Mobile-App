package Mamalia;
public class Animal{
    
    // Initialize properties via constructor
    int age;
    int height;
    int weight;
 
    // Constructor with parameters
    Animal(int age,int height,int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
 
    void run() {
        System.out.println("Running Very Fast..");
    }
 
    void walk() {
        System.out.println("Walk and jump..");
    }
 
    void eat() {
        System.out.println("Eat carrot using mouth and jaw");
    }
 
    int getage() {
        return age;
    }
 
    double getweight() {
        return weight;
    }
 
    double getheight() {
        return height;
    }
 
}
