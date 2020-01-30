public class KiwiTester
{
    public static void main(String[] args)
    {
        // testing both null and normal constructor
        KiwiBird kiwi1 = new KiwiBird();
        KiwiBird kiwi2 = new KiwiBird("Alexa", 15.0, "Brown Kiwi", "Male", "Coromandel", 10.0, 4);
        // testing all accessors
        System.out.println("kiwi1 name should be default: " + kiwi1.getName() );
        System.out.println("kiwi1 species should be default: " + kiwi1.getSpecies() );        
        System.out.println("kiwi1 size should be default: " + kiwi1.getSize() );
        System.out.println("kiwi1 gender should be default: " + kiwi1.getGender());
        System.out.println("kiwi1 subSpecies should be default: " + kiwi1.getSubSpecies());
        System.out.println("kiwi1 wingSize should be default: " + kiwi1.getWingSize());
        System.out.println("kiwi1 beakSize should be default: " + kiwi1.getBeakSize());
        // testing all mutators
        System.out.println("Setting kiwi1's name to be John...");
        kiwi1.setName("John");  
        System.out.println("kiwi1's name is now " + kiwi1.getName() );

        System.out.println("Setting kiwi1's gender to be female...");
        kiwi1.setGender("Female");  
        System.out.println("kiwi1's gender is now " + kiwi1.getGender() ); 

        System.out.println("Setting kiwi1's species to be Tokoeka Kiwi...");
        kiwi1.setSpecies("Tokoeka Kiwi");
        System.out.println("kiwi1's species is now " + kiwi1.getSpecies() );

        System.out.println("Setting kiwi1's subspecies to be Haast...");
        kiwi1.setSubSpecies("Haast");
        System.out.println("kiwi1's subspecies is now " + kiwi1.getSubSpecies() );

        System.out.println("Setting kiwi1's size to be 27.0...");
        kiwi1.setSize(27);
        System.out.println("kiwi1's size is now " + kiwi1.getSize() );

        System.out.println("Unreasonable value -7 being inputted into size, beakSize, and wingSize...");
        kiwi1.setSize(-7);
        kiwi1.setBeakSize(-7);
        kiwi1.setWingSize(-7);
        System.out.println("kiwi1's size, beak size, and wingsize are now " + kiwi1.getSize() + ", " + kiwi1.getWingSize() +
                           ", " + kiwi1.getBeakSize());

        System.out.println("Empty string name being inputted...");
        kiwi1.setName("");
        System.out.println("kiwi1's name is now " + kiwi1.getName() );

        // testing void methods
        System.out.println("Testing eat, makeSound, and layEgg methods...");
        System.out.println(kiwi1.getName() + ", eat!");
        kiwi1.eat();
        System.out.println(kiwi1.getName() + ", Speak!");
        kiwi1.makeSound();  
        System.out.println("Testing makeSound(4)...");
        kiwi1.makeSound(4);
        System.out.println(kiwi1.getName() + ", lay an egg!");
        kiwi1.layEgg();
        System.out.println("Testing toString()...");
        System.out.println(kiwi1);        
        
        System.out.println("\nTesting Kiwi2\n");
        
        System.out.println("kiwi2 name should be \"Alexa\": " + kiwi2.getName() );
        System.out.println("kiwi2 species should be \"Brown Kiwi\": " + kiwi2.getSpecies() );        
        System.out.println("kiwi2 size should be 15.0: " + kiwi2.getSize() );
        System.out.println("kiwi2 gender should be male: " + kiwi2.getGender());
        System.out.println("kiwi2 subSpecies should be \"Coromandel\": " + kiwi2.getSubSpecies());
        System.out.println("kiwi2 wingSize should be 10.0: " + kiwi2.getWingSize());
        System.out.println("kiwi2 beakSize should be 4: " + kiwi2.getBeakSize());

        System.out.println("Testing eat, makeSound, and layEgg methods...");
        System.out.println(kiwi2.getName() + ", eat!");
        kiwi2.eat();
        System.out.println(kiwi2.getName() + ", Speak!");
        kiwi2.makeSound();  
        System.out.println("Testing makeSound(4)...");
        kiwi2.makeSound(4);
        System.out.println(kiwi2.getName() + ", lay an egg!");
        kiwi2.layEgg();
        System.out.println("Testing toString()...");
        System.out.println(kiwi2);        

     }
}
