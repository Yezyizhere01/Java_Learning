abstract class Animal{
    // abstract function does not have a body
    // it has to be implemented in the subclass
    abstract void makeSound();

    public void sleep(){
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("The dog barks.");
    }
}

public class abstractExample{
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: The dog barks.
        myDog.sleep();     // Outputs: The animal is sleeping.
    }
}