// states the methods that the zoo needs to implements.
interface ObserverActions {
    // adding a new observer to the observers list.
    void addObserver(ZooObserver newObserver);
    // removing an observer from the observers list.
    void removeObserver(ZooObserver observerToRemove);
    // notify all the observers about events in the zoo.
    void notifyObservers();
}
