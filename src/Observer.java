// states the method that a zoo observer needs to implement.
abstract class Observer {
    //  the method is responsible for sending the updates to the zoo observers.
    public abstract void newMessage(String message);
}
