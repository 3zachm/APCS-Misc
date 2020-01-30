
/**
 * This program exists to test our virtual Dog.  We will create several different Dog objects
 * and test their methods to make sure they work.
 *
 * @author Mrs. Mirras
 * @version 3/5/2019
 */
public class DogTester
{
    public static void main(String[] args)
    {
        // Create a virtual Dog using Java keyword "new"

        Dog doggy1 = new Dog();
        Dog doggy2 = new Dog("Snoopy", "Beagle", 15);

        
        System.out.println("doggy1.name should be the default Dog name: " + doggy1.name);
        System.out.println("doggy1.breed should be the default Dog breed: " + doggy1.breed);
        System.out.println("doggy1.size should be the default Dog size: " + doggy1.size);
        doggy1.name = "Winter";
        System.out.println("doggy1 name should be \"Winter\": " + doggy1.name);
        doggy1.breed = "American Eskimo";
        System.out.println("doggy1 breed should be \"American Eskimo\": " + doggy1.breed);        
        doggy1.size = 11;   // she weighs 11 pounds
        System.out.println("doggy1 size should be 11: " + doggy1.size);
        
        // test the methods doTrick(), makeSound(), and eat()
        System.out.println("Testing eat, doTrick and makeSound methods...");
        System.out.println(doggy1.name + ", do a trick!");
        doggy1.doTrick();
        System.out.println(doggy1.name + ", eat!");
        doggy1.eat();
        System.out.println(doggy1.name + ", Speak!");
        doggy1.makeSound();  
        System.out.println("Testing makeSound(4)...");
        doggy1.makeSound(4);
        System.out.println("Testing toString()...");
        System.out.println(doggy1);        
        System.out.println("That's my dog!\n\n");
        
        System.out.println("Repeating tests with doggy2.\n\n");
        
        System.out.println("doggy2 name should be \"Snoopy\": " + doggy2.name);
        System.out.println("doggy2 breed should be \"Beagle\": " + doggy2.breed);        
        System.out.println("doggy2 size should be 15: " + doggy2.size);
        
        // test the methods doTrick(), makeSound(), and eat()
        System.out.println("Testing eat, doTrick and makeSound methods...");
        System.out.println(doggy2.name + ", do a trick!");
        doggy2.doTrick();
        System.out.println(doggy2.name + ", eat!");
        doggy2.eat();
        System.out.println(doggy2.name + ", Speak!");
        doggy2.makeSound();  
        System.out.println("Testing makeSound(4)...");
        doggy2.makeSound(4);
        System.out.println("Testing toString()...");
        System.out.println(doggy2);        
        System.out.println("That's my other dog!\n\n");
        
     }
}
