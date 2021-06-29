// this interface represents an animal. an animal is able to eat and participate in a show.
// each animal implements this interface
public interface Animal {
    // an animal is eating
    void eat();
    // an animal participate in show
    void participateInShow();
    // returns a String representing the animal's type
    String toString();
}
