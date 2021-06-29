// a Unicorn is an animal and therefore implements all the methods of an Animal.
public class Unicorn implements Animal {
    public void eat(){
        // a unicorn eats.
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    // a unicorn is participating in a show.
    public void participateInShow(){
        System.out.println("The unicorn is flying...");
    }

    // returns a String representing the animal's type - Unicorn.
    public String toString(){
        return "Unicorn";
    }
}
