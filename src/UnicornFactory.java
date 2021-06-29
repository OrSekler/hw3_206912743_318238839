// creates a new Unicorn. implements AnimalFactory.
public class UnicornFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Unicorn();
    }
}
