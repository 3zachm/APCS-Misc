public class KiwiBird extends Animal
{
    private String subSpecies;
    private double wingSize;
    private int beakSize;
    // null constructor
    public KiwiBird() {
        setName("N/A");
        setSize(0.0);
        setSpecies("N/A");
        setGender("Male");
        subSpecies = "N/A";
        wingSize = 0.0;
        beakSize = 0;
    }
    // constructor
    public KiwiBird(String newName, double newSize, String newSpecies, String newGender,
                    String newSubSpecies, double newWingSize, int newBeakSize) {
        setName(newName);
        setSize(newSize);
        setSpecies(newSpecies);
        setSubSpecies(newSubSpecies);
        setWingSize(newWingSize);
        setBeakSize(newBeakSize);
        if (newGender.equalsIgnoreCase("Male")) { // the animal class used did not have defined genders, required for the layEgg() method
            setGender(newGender);
        }
        else if (newGender.equalsIgnoreCase("Female")) {
            setGender(newGender);
        }
        else {
            setGender("Male");
            System.out.println("Gender defaulted to male due to invalid gender. Must be male or female.");
        }
    }
    // mutators and corresponding accessors
    public String getSubSpecies() {
        return subSpecies;
    }
    
    public void setSubSpecies(String newSubSpecies) {
        if (newSubSpecies.length() < 1) {
            subSpecies = "N/A";
            System.out.println("Animal sub species must be at least 1 valid ASCII character");
        }
        else {
            subSpecies = newSubSpecies;
        }
    }
    
    public double getWingSize() {
        return wingSize;
    }

    public void setWingSize(double newWingSize) {
        if (newWingSize < 0) {
            wingSize = 0;
            System.out.println("Animal wing size must be at least 0");
        }
        else {
            wingSize = newWingSize;
        }        
    }

    public void setBeakSize(int newBeakSize) {
        if (newBeakSize < 0) {
            beakSize = 0;
            System.out.println("Animal beak size must be at least 0");
        }
        else {
            beakSize = newBeakSize;
        }        
    }

    public double getBeakSize() {
        return beakSize;
    }
    // void methods, 'actions'
    public void makeSound() {
        System.out.println(getName() + " makes whatever sound a kiwi makes!");
    }

    public void makeSound(int numof)
    {
        for (int i = 0; i < numof; i++)
        {
            makeSound();
        }
    }

    public void eat() {
        System.out.println(getName() + " eats what a " + getSpecies() + " " + subSpecies + " would eat.");
    }

    public void layEgg() {
        if (getGender().equalsIgnoreCase("Male")) {
            System.out.println(getName() + " cannot lay an egg as it is male.");
        }
        else if (getGender().equalsIgnoreCase("Female")) {
            System.out.println(getName() + " lays an egg.");
        }
    }
    // overriding Java's toString
    public String toString() {
        return "-----------Kiwi:-----------" + "\nName: " + getName() + "\nSpecies: " + getSpecies() + 
            "\nSubspecies: " + subSpecies + "\nSize: " + getSize() + "\nGender: " + getGender() + 
            "\nWing Size: " + wingSize + "\nBeak Size: " + beakSize + "\nHash: " + hashCode(); 
    }
}
