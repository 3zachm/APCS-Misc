
/**
 * This program exists to test our virtual Dog.  We will create several different 
 * BetterDog objects and test their methods to make sure they work.  
 * 
 * This version tests the BetterDog (the encapsulated version!)
 *
 * @author Mrs. Mirras
 * @version 3/19/2019
 */
public class BetterDogTester
{
    public static void main(String[] args)
    {
        // Create a virtual Dog using Java keyword "new"

        BetterDog doggy1 = new BetterDog();
        BetterDog doggy2 = new BetterDog("Snoopy", "Beagle", 15);

        
        System.out.println("doggy1.name should be the default Dog name: " + doggy1.getName() );
        System.out.println("doggy1.breed should be the default Dog breed: " + doggy1.getBreed() );
        System.out.println("doggy1.size should be the default Dog size: " + doggy1.getSize() );
        
        System.out.println("Setting doggy1's name to be Dennis...");
        doggy1.setName("Dennis");  // doggy1.name = "Dennis";
        System.out.println("Doggy1's name is now " + doggy1.getName() );
        
        System.out.println("Setting doggy1's breed to be Labrador...");
        doggy1.setBreed("Labrador");
        System.out.println("Doggy1's breed is now " + doggy1.getBreed() );
        
        System.out.println("Setting doggy1's size to be 27...");
        doggy1.setSize(27);
        System.out.println("Doggy1's size is now " + doggy1.getSize() );

        System.out.println("Try setting doggy1's size to be something unreasonable like -7...");
        doggy1.setSize(-7);
        System.out.println("Doggy1's size should NOT be -7.  It should be some reasonable default value.");
        System.out.println("Doggy1's size is now " + doggy1.getSize() );
        System.out.println("Try setting doggy1's name to be an empty string...");
        doggy1.setName("");
        System.out.println("Doggy1's name should now be \"Bob\" (could be ANY generic name)");
        System.out.println("Doggy1's name is now " + doggy1.getName() );

        /*    
         * We didn't change the doTrick(), makeSound() and eat() code, so we can
         * omit the tester code that retests these methods.
         * 
         * You may remove the comments to include this in your tester if you would like.
         * 
        // test the methods doTrick(), makeSound(), and eat()
        System.out.println("Testing eat, doTrick and makeSound methods...");
        System.out.println(doggy1.getName() + ", do a trick!");
        doggy1.doTrick();
        System.out.println(doggy1.getName() + ", eat!");
        doggy1.eat();
        System.out.println(doggy1.getName() + ", Speak!");
        doggy1.makeSound();  
        System.out.println("Testing makeSound(4)...");
        doggy1.makeSound(17);
        System.out.println("Testing toString()...");
        System.out.println(doggy1);        
        System.out.println("That's my dog!\n\n");
        */
        
        System.out.println("\nRepeating tests with doggy2.\n");
        
        System.out.println("doggy2 name should be \"Snoopy\": " + doggy2.getName() );
        System.out.println("doggy2 breed should be \"Beagle\": " + doggy2.getBreed() );        
        System.out.println("doggy2 size should be 15: " + doggy2.getSize() );
        
        // test the methods doTrick(), makeSound(), and eat()
        System.out.println("Testing eat, doTrick and makeSound methods...");
        System.out.println(doggy2.getName() + ", do a trick!");
        doggy2.doTrick();
        System.out.println(doggy2.getName() + ", eat!");
        doggy2.eat();
        System.out.println(doggy2.getName() + ", Speak!");
        doggy2.makeSound();  
        System.out.println("Testing makeSound(5)...");
        doggy2.makeSound(5);
        System.out.println("Testing toString()...");
        System.out.println(doggy2);        
        System.out.println("That's my other dog!\n\n");

     }
}
