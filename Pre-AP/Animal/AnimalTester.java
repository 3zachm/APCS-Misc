
/**
 * This program exists to test our virtual Animal.  We will create several different 
 * Animal objects and test their methods to make sure they work.  
 * 
 * This version tests the Animal (the encapsulated version!)
 *
 * @author Mrs. Mirras
 * @version 3/19/2019
 */
public class AnimalTester
{
    public static void main(String[] args)
    {
        // Create a virtual Animal using Java keyword "new"

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Snoopy", 15.0, "Animal", "Male");

        
        System.out.println("animal1.name should be the default Animal name: " + animal1.getName() );
        System.out.println("animal1.breed should be the default Animal species: " + animal1.getSpecies() );
        System.out.println("animal1.size should be the default Animal size: " + animal1.getSize() );
        System.out.println("animal1.size should be the default Animal gender: " + animal1.getGender() );

        System.out.println("Setting animal1's name to be Dennis...");
        animal1.setName("Dennis");  
        System.out.println("animal1's name is now " + animal1.getName() );

        System.out.println("Setting animal1's gender to be male...");
        animal1.setGender("Male");  
        System.out.println("animal1's gender is now " + animal1.getGender() );
        
        System.out.println("Setting animal1's breed to be AnotherAnimal...");
        animal1.setSpecies("AnotherAnimal");
        System.out.println("animal1's breed is now " + animal1.getSpecies() );
        
        System.out.println("Setting animal1's size to be 27...");
        animal1.setSize(27);
        System.out.println("animal1's size is now " + animal1.getSize() );

        System.out.println("Try setting animal1's size to be something unreasonable like -7...");
        animal1.setSize(-7);
        System.out.println("animal1's size should NOT be -7.  It should be some reasonable default value.");
        System.out.println("animal1's size is now " + animal1.getSize() );
        System.out.println("Try setting animal1's name to be an empty string...");
        animal1.setName("");
        System.out.println("animal1's name should now be \"N/A\" (could be ANY generic name)");
        System.out.println("animal1's name is now " + animal1.getName() );

        // test the methods makeSound() and eat()
        System.out.println("Testing eat, doTrick and makeSound methods...");
        System.out.println(animal1.getName() + ", eat!");
        animal1.eat();
        System.out.println(animal1.getName() + ", Speak!");
        animal1.makeSound();  
        System.out.println("Testing makeSound(4)...");
        animal1.makeSound(4);
        System.out.println("Testing toString()...");
        System.out.println(animal1);        
        System.out.println("That's my Animal!\n\n");
        
        System.out.println("\nRepeating tests with animal2.\n");
        
        System.out.println("animal2 name should be \"Snoopy\": " + animal2.getName() );
        System.out.println("animal2 species should be \"Animal\": " + animal2.getSpecies() );        
        System.out.println("animal2 size should be 15: " + animal2.getSize() );
        
        // test the methods doTrick(), makeSound(), and eat()
        System.out.println("Testing eat, doTrick and makeSound methods...");
        System.out.println(animal2.getName() + ", eat!");
        animal2.eat();
        System.out.println(animal2.getName() + ", Speak!");
        animal2.makeSound();  
        System.out.println("Testing makeSound(5)...");
        animal2.makeSound(5);
        System.out.println("Testing toString()...");
        System.out.println(animal2);        
        System.out.println("That's my other animal!\n\n");

     }
}
