// a monkey is an animal and therefore implements all the methods of an Animal
public class Monkey implements Animal{
    // a monkey eats
    public void eat(){
        System.out.println("The monkey is eating a banana...");
    }

    // a monkey is participating in a show
    public void participateInShow(){
        System.out.println("The monkey is hanging on trees...");
    }

    // returns a String representing the animal's type - Monkey
    public String toString(){
        return "Monkey";
    }
}