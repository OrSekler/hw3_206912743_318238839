// creates a new Zebra. implements AnimalFactory.
public class ZebraFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Zebra();
    }
}