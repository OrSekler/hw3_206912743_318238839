// a Zebra is an animal and therefore implements all the methods of an Animal.
public class Zebra implements Animal{
    // a zebra eats.
    public void eat(){
        System.out.println("The zebra is eating grass...");
    }

    // a zebra is participating in a show.
    public void participateInShow(){
        System.out.println("The zebra is running...");
    }

    // returns a String representing the animal's type - Zebra.
    public String toString(){
        return "Zebra";
    }
}
