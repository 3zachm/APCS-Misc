public class Cat
{
    // Instance variables
    private String name;
    private String breed;
    private int size;
    private int contentment;
    
    // Constructor for a Cat
    public Cat()  // null parameter constructor
    {
        name = "N/A";
        breed = "N/A";
        size = 0;
        contentment = 0;
    }
    
    // make a 4 argument constructor
    public Cat(String newName, String newBreed, int newSize, int newContentment)
    {
        name = newName;
        breed = newBreed;
        size = newSize;
        contentment = newContentment;
    }
    
    // accessors and mutators
    public String getName() {
        return name;
    }

    public void setName(String newName) { // mutator returns void
        if (newName.length() > 0) {
            name = newName;
        }
        else {
            name = "N/A";
            
        }
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String newBreed) { // mutator returns void
        breed = newBreed;
    }
    public int getSize() {
        return size;
    }

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

    public int getContentment() {
        return contentment;
    }

    public void setContentment(int newContentment) { // mutator returns void
        if (newContentment < 0) {
            size = 0;
            //System.out.println("Set to default");
        }
        else
        {
            size = newContentment;
        }
    }

    public void makeSound()
    {
        if (size < 10)
        {   // This is done if size is less than 10
            System.out.println(name + " says meow!");
        }
        else if (size < 15)
        {   // This is done for size 10 through 14
            System.out.println(name + " says meowww!");
        }
        else
        {   // This is done if size is 15 or more
            System.out.println(name + " says MEOWWW!!");
        }
    }

    public void purr()
    {
        if (size < 10)
        {   // This is done if size is less than 10
            System.out.println(name + " purrs softly.");
        }
        else if (size < 15)
        {   // This is done for size 10 through 14
            System.out.println(name + " purrs at an average volume.");
        }
        else
        {   // This is done if size is 15 or more
            System.out.println(name + " purrs loudly!");
        }
    }
    
    public void makeSound(int numOfMeows)
    {
        for (int i = 0; i < numOfMeows; i++)
        {
            makeSound();
        }
    }
    
    public void play()
    {
        System.out.println(name + " plays with a fake mouse.");
    }
    
    public void eat()
    {
        System.out.println(name + " eats slowly.");
    }

    public String toString()
    {
        return "-----------Cat:-----------" + "\nName: " + name + "\nBreed: " + breed + 
            "\nSize: " + size + "\nContentment: " + contentment + "\nHash: " + hashCode(); 
    }
}