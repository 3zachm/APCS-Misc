public class Dog {

    String name;
    String breed;
    int size;
    // keep in mind the differences between static and non-static methods
    public Dog() {  // null parameter constructor
        name = "N/A";
        breed = "N/A";
        size = 0; 
    }

    public Dog(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public void makeSound() {
        if (size < 10) { 
            System.out.println(name + " says bark.");
        }    
        else if (size < 5) {
            System.out.println(name + " says arf!");
        }
        else {
            System.out.println(name + " says ARF!");
        }
    }
    
    public void doTrick() {
        System.out.println(name + " does a backflip.");
    }
    
    public void eat() {
        System.out.println("Dog eats a bar of soap!");
    }

    public String toString() {
        return "-----------Dog:-----------" + "\nName: " + name + "\nBreed: " + breed + "\nSize: " + size + "\nHash: " + hashCode(); 
    }

    public void makeSound(int times) {
        for(; times>0; times--) {
            if (size < 10) { 
                System.out.println(name + " says bark.");
            }    
            else if (size < 5) {
                System.out.println(name + " says arf!");
            }
            else {
                System.out.println(name + " says ARF!");
            }            
        }
    }
}