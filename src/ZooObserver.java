// a zooObserver is an observer and therefore implements all the methods of an Observer.
public class ZooObserver extends Observer{
    private final String observerName;
    protected String message;

    // constructor
    public ZooObserver (String name){
        this.observerName = name;
    }
    // updates the message content
    public void newMessage(String newMessage){
        this.message = newMessage;
        showMessage();
    }

    // prints the message context to the observer
    public void showMessage(){
        System.out.println("[" + observerName + "] " + message);
    }
}
