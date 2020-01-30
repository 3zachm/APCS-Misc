public class BetterDog extends Animal
{
    // Instance variables
    private String name;
    private String breed;
    //private int size;
    
    // Constructor for a Dog
    public BetterDog()  // null parameter constructor
    {
        //name = "N/A";
        breed = "N/A";
        //size = 0;
    }
    
    // make a 3 argument constructor
    public BetterDog(String newName, String newBreed, int newSize)
    {
        //name = newName;
        breed = newBreed;
        //size = newSize;
    }
    
    // accessors and mutators
    /*public String getName() {
        return name;
    }

    public void setName(String newName) { // mutator returns void
        if (newName.length() > 0) {
            name = newName;
        }
        else {
            name = "N/A";
            
        }
    }*/
    public String getBreed() {
        return breed;
    }

    public void setBreed(String newBreed) { // mutator returns void
        breed = newBreed;
    }
    /*public int getSize() {
        return size;
    }
    /*
    public void setSize(int newSize) { // mutator returns void
        if (newSize < 0) {
            size = 0;
            //System.out.println("Set to default");
        }
        else
        {
            size = newSize;
        }
    }
    */
    public void makeSound()
    {
        if (getSize() < 10)
        {   // This is done if size is less than 10
            System.out.println(name + " says Yip, yip!");
        }
        else if (getSize() < 15)
        {   // This is done for size 10 through 14
            System.out.println(name + " says Woof!");
        }
        else
        {   // This is done if size is 15 or more
            System.out.println(name + " says BARK!!");
        }
    }
    
    public void makeSound(int numOfBarks)
    {
        for (int i = 0; i < numOfBarks; i++)
        {
            makeSound();
        }
    }
    
    public void doTrick()
    {
        System.out.println("Dog does an amazing trick.");
    }
    
    public void eat()
    {
        System.out.println("Dog eats voraciously.");
    }
    /*
    public String toString()
    {
        return "-----------Dog:-----------" + "\nName: " + name + "\nBreed: " + breed + 
            "\nSize: " + Anima + "\nHash: " + hashCode(); 
    }
    */
}