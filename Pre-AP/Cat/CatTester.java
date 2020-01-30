public class CatTester
{
   public static void main(String[] args)
   {
    Cat cat1 = new Cat();
    Cat cat2 = new Cat("Coffee", "Tabby", 7, 9);
    
    System.out.println("cat1.name should be the deafault Cat name: " + cat1.getName() );
    System.out.println("cat1.breed should be the default Cat breed: " + cat1.getBreed() );
    System.out.println("cat1.size should be the default Cat size: " + cat1.getSize() );
    System.out.println("cat1.contentment should be the default Cat contenment: " + cat1.getContentment() );
    System.out.println("Setting Cat1's name to be Mishka...");
    cat1.setName("Mishka");
    System.out.println("Cat1's name is now " + cat1.getName() );
    System.out.println("Setting cat1's breed to Turkish Angora...");
    cat1.setBreed("Turkish Angora");
    System.out.println("Cat1's breed is now " + cat1.getBreed() );
    System.out.println("Setting Cat1's size to -6...");
    cat1.setSize(-6);
    System.out.println("Cat1's size is now " + cat1.getSize() );
    System.out.println("Setting Cat1's contentment to 5...");
    cat1.setContentment(5);
    System.out.println("Cat1's contentment is now " + cat1.getContentment() );
    cat1.purr();
    
    System.out.println("\nRepeating tests with cat2.\n");
    System.out.println("cat2.name should be Tyron: " + cat2.getName() );
    System.out.println("cat2.breed should be Tabby: " + cat2.getBreed() );
    System.out.println("cat2.size should be 7: " + cat2.getSize() );
    System.out.println("cat2.contentment should be 9: " + cat2.getContentment() );
    System.out.println("Testing eat, doTrick, makeSound, and purr methods...");
    System.out.println(cat2.getName() + ", play!");
    cat2.play();
    System.out.println(cat2.getName() + ", eat!");
    cat2.eat();
    System.out.println(cat2.getName() + ", Speak!");
    cat2.makeSound();  
    cat1.purr();
    System.out.println("Testing makeSound(5)...");
    cat2.makeSound(5);
    System.out.println("Testing toString()...");
    System.out.println(cat2);        
   }
}
