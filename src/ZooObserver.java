public class ZooObserver extends Observer{
    private final String observerName;
    protected String message;
    // constructor
    public ZooObserver (String name){
        this.observerName = name;
    }

    public void newMessage(String newMessage){
        this.message = newMessage;
        showMessage();
    }

    public void showMessage(){
        System.out.println("[" + observerName + "] " + message);
    }
}
