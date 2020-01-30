
public class Animal {
    private String name;
    private double size;
    private String species;
    private String gender;

    public Animal() {
        name = "N/A";
        size = 0;
        species = "N/A";
        gender = "N/A";
    }

    public Animal(String newName, double newSize, String newSpecies, String newGender) {
        setName(newName);
        setSpecies(newSpecies);
        setSize(newSize);
        setGender(newGender);
    }
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String newName) {
        if (newName.length() < 1) {
            name = "N/A";
            System.out.println("Animal name must be at least 1 valid ASCII character");
        }
        else {
            name = newName;
        }        
    }

    public void setSpecies(String newSpecies) {
        if (newSpecies.length() < 1) {
            species = "N/A";
            System.out.println("Animal species must be at least 1 valid ASCII character");
        }
        else {
            species = newSpecies;
        }
    }

    public void setGender(String newGender) {
        if (newGender.length() < 1) {
            gender = "N/A";
            System.out.println("Animal gender must be at least 1 valid ASCII character");
        }
        else {
            gender = newGender;
        }        
    }

    public void setSize(double newSize) {
        if (newSize < 0) {
            size = 0;
            System.out.println("Animal size must be at least 0");
        }
        else {
            size = newSize;
        }        
    }

    public void makeSound() {
        System.out.println(name + " makes a " + species + " sound!");
    }

    public void makeSound(int numof)
    {
        for (int i = 0; i < numof; i++)
        {
            makeSound();
        }
    }

    public void eat() {
        System.out.println(name + " eats what a " + species + " would eat.");
    }

    public String toString() {
        return "-----------Animal:-----------" + "\nName: " + name + "\nSpecies: " + species + 
            "\nSize: " + size + "\nGender: " + gender + "\nHash: " + hashCode(); 
    }

}