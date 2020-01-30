public class DogTester2 {
    public static void main(String[] args) {
        //media playing stuff
        Dog doggy1 = new Dog(); // will use defaults from null parameter
        Dog doggy2 = new Dog("Doggy", "Mutt", 10);
        
        System.out.println(doggy1.name);
        doggy1.makeSound();
        System.out.println(doggy2.name);
        doggy2.makeSound();
        System.out.println(doggy1); // outputs overridden tostring
        doggy2.makeSound(2); // figure out how to playback mp3
    }
}
