import java.util.ArrayList;

public class Zoo {
    int happinessLevel = 2;
    int hungerLevel = 3;
    int monkeyCounter = 0;
    int unicornCounter = 0;
    int zebraCounter = 0;

    private static Zoo instance = null;
    public ArrayList<Animal> animalsList = new ArrayList<Animal>();

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

    }

    public void watchAnimals(){
        for(int i = 0; i < animalsList.size(); i++){
            animalsList.get(i).participateInShow();
        }
        happinessLevel++;

    }
}

/*

 */
