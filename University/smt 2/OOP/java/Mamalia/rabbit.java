package Mamalia;
public class rabbit {

        public static void main(String[] args) {

        // Summons the Animal class 
        Animal rabbit = new Animal(4,20,4); 
        rabbit.eat(); //Method or behavior of rabbit animals
        rabbit.walk();
        rabbit.run();
      
        // Using the getAge function of the Animal class
        System.out.println("the age of rabbit is"+" "+ rabbit.getage() +" "+"years old");
       
        // Calculation of body mass index (BMI)
        // Formula: weight(kg) / ( height(m) * height(m) )
        double bmi = rabbit.getweight() / ((rabbit.getheight() * 0.01) * (rabbit.getheight() * 0.01));
       
        // Result
        System.out.println("Rabbit body mass index is " + bmi);

   }

   

}