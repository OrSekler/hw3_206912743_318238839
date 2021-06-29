import java.util.ArrayList;

public class Zoo implements ObserverActions{
    int happinessLevel = 2; // default level of happiness
    int hungerLevel = 3; // default level of hunger
    int monkeyCounter = 0;
    int unicornCounter = 0;
    int zebraCounter = 0;
    String currentMessage;

    private static Zoo instance = null;
    public ArrayList<Animal> animalsList = new ArrayList<Animal>(); // initiating an empty ArrayList for animals in the zoo.
    public ArrayList<ZooObserver> zooObservers = new ArrayList<ZooObserver>(); // initiating an empty ArrayList for Zoo Observers.

    private Zoo(){}

    // use of singleton design pattern in order to create only 1 zoo.
    public static Zoo getInstance(){
        if(instance == null){
            instance = new Zoo();
            System.out.println("Creating zoo...");
        }
        else{
            System.out.println("The zoo already exists...");
        }
        return instance;
    }

    // adding a new animal to the zoo.
    public void addAnimal(Animal animal){
        animalsList.add(animal);
        this.currentMessage = animal.toString() + " has been added to the zoo!";
        // sending a notification to the observers that an animal was added to the zoo.
        notifyObservers();
    }

    // print info about the animals in the zoo.
    public void showAnimalsInfo(){
        // counts the amount of each animal in the zoo.
        for(int i = 0; i < animalsList.size(); i++){
            if (animalsList.get(i) instanceof Monkey){
                monkeyCounter++;
            }
            else if (animalsList.get(i) instanceof Zebra){
                zebraCounter++;
            }
            else if (animalsList.get(i) instanceof Unicorn){
                unicornCounter++;
            }
        }
        // prints the generic information about the animals in the zoo.
        System.out.println("The zoo contains total of " + animalsList.size() + " animals:");
        System.out.println("- Zebra: " + zebraCounter);
        System.out.println("- Unicorn: " + unicornCounter);
        System.out.println("- Monkey: " + monkeyCounter);
        System.out.println("Happiness level: " + happinessLevel);
        if (happinessLevel > 3){
            System.out.println("The animals are very happy, keep working hard...");
        }
        else {
            System.out.println("The animals are not happy, you should watch them...");
        }
        System.out.println("Hunger level: " + hungerLevel);
        if(hungerLevel > 3){
            System.out.println("The animals are hungry, you should feed them...");
        }
        monkeyCounter = 0;
        zebraCounter = 0;
        unicornCounter = 0;
    }

    // feed all the animals.
    public void feedAnimals(){
        for(int i = 0; i < animalsList.size(); i++){
            animalsList.get(i).eat();
        }
        // decrease hunger level by 1.
        if (hungerLevel > 1){
            hungerLevel--;
        }
        this.currentMessage = "The animals are being fed";
        // notify the observers that the animals are being fed.
        notifyObservers();
    }

    // the animals participates in a show.
    public void watchAnimals(){
        for(int i = 0; i < animalsList.size(); i++){
            animalsList.get(i).participateInShow();
        }
        // happiness level is increased by 1.
        if (happinessLevel < 5){
            happinessLevel++;
        }
        // hunger level is decreased by 1.
        if (hungerLevel < 5){
            hungerLevel++;
        }
        this.currentMessage = "The animals are being watched";
        // notify the observers that the animals are being watched.
        notifyObservers();
    }

    // adding a new observer to the observers ArrayList.
    public void addObserver(ZooObserver newObserver){
        this.zooObservers.add(newObserver);
    }

    // removing an observer from the observers ArrayList.
    public void removeObserver(ZooObserver observerToRemove){
        this.zooObservers.remove(observerToRemove);
    }

    // responsible to notify all the observers about events in the zoo.
    public void notifyObservers(){
        System.out.println("Notifying observers:");
        for (int i = 0; i < zooObservers.size(); i++){
            zooObservers.get(i).newMessage(currentMessage);
        }
    }
}
