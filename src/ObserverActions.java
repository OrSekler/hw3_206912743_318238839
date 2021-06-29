interface ObserverActions {
    void addObserver(ZooObserver newObserver);
    void removeObserver(ZooObserver observerToRemove);
    void notifyObservers();
}
