import java.util.ArrayList;

public class Zoo implements ObserverActions{
    int happinessLevel = 2;
    int hungerLevel = 3;
    int monkeyCounter = 0;
    int unicornCounter = 0;
    int zebraCounter = 0;
    String currentMessage;

    private static Zoo instance = null;
    public ArrayList<Animal> animalsList = new ArrayList<Animal>();/////////////////////// move to constructor ?
    public ArrayList<ZooObserver> zooObservers = new ArrayList<ZooObserver>();

    private Zoo(){}

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

    public void addAnimal(Animal animal){
        animalsList.add(animal);
        this.currentMessage = animal.toString() + " has been added to the zoo!";
        notifyObservers();
    }

    public void showAnimalsInfo(){
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
        System.out.println("The zoo contains total of " + animalsList.size() + " animals:");
        System.out.println("-Zebra: " + zebraCounter);
        System.out.println("-Unicorn: " + unicornCounter);
        System.out.println("-Monkey: " + monkeyCounter);
        System.out.println("Happiness level: " + happinessLevel);
        if (happinessLevel < 3){
            System.out.println("The animals are very happy, keep working hard...");
        }
        else {
            System.out.println("The animals are not happy, you should watch them...");
        }
        System.out.println("Hunger level: " + hungerLevel);
        if(hungerLevel < 3){
            System.out.println("The animals are hungry, you should feed them...");
        }
    }

    public void feedAnimals(){
        for(int i = 0; i < animalsList.size(); i++){
            animalsList.get(i).eat();
        }
        hungerLevel--;
        this.currentMessage = "The animals are being fed";
        notifyObservers();

    }

    public void watchAnimals(){
        for(int i = 0; i < animalsList.size(); i++){
            animalsList.get(i).participateInShow();
        }
        happinessLevel++;
        this.currentMessage = "The animals are being watched";
        notifyObservers();
    }

    public void addObserver(ZooObserver newObserver){
        this.zooObservers.add(newObserver);
    }

    public void removeObserver(ZooObserver observerToRemove){
        this.zooObservers.remove(observerToRemove);
    }

    public void notifyObservers(){
        System.out.println("Notifying observers:");
        for (int i = 0; i < zooObservers.size(); i++){
            zooObservers.get(i).newMessage(currentMessage);
        }
    }
}
